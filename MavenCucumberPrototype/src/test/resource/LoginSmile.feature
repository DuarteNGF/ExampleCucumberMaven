@Smile
Feature: Testar o acesso à plataforma Smile

@Smile
Scenario: Login
Given Abrir o IE
	And Autenticar com utilziador registado 
When Esperar cinco segundos e fazer Logout
Then Fechar o Browser
