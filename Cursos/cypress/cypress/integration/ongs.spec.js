//auto complete do cypress
/// <reference types="cypress" /> 

describe('Ongs', () => {
    it('devem poder realizar um cadastro',() =>{
        cy.visit('http://localhost/');
        // cy.ger - busca um elemento
        // .type - insere um texto

        cy.get('[data-cy=name]').type('Dogs queridos');
        cy.get('[data-cy=email]').type('dogs@mail.com');
        cy.get('[data-cy=whatsapp]').type('51999999999');
        cy.get('[data-cy=city]').type('Porto Alegre');
        cy.get('[data-cy=uf]').type('RS');

        // routing
        // start server com cy.server()
        // criar uma rota com cy.route()
        // atribuir rota a um alias
        // esperar com cy.wait e fazer uma validação

        cy.server();
        cy.route('POST', '**/ongs').as('postOn');

        cy.get('[data-cy=submit]').click();

        cy.wait('@postOn').then((xhr) =>{
            expect(xhr.status).be.eq(200);
            expect(xhr.response.body).has.property('id');
            expect(xhr.response.body.id).is.not.null;
        })

    });
    it('deve poder realizar um login no sistema',() =>{

        const createOngId = Cypress.env('createdOngId');

        cy.log(createOngId);

        cy.visit('http://localhost');
        cy.get('input').type(createOngId);
        cy.get('.button').click();
    });
});
