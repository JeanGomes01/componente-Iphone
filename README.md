# Projeto: Modelagem e Implementação do Componente iPhone

Este projeto consiste na modelagem e implementação de um componente iPhone que simula as principais funcionalidades do dispositivo, incluindo o Reprodutor Musical, Aparelho Telefônico, e o Navegador na Internet.

## Contexto
O projeto foi inspirado no vídeo de lançamento do iPhone de 2007, que apresentou suas principais funcionalidades. O objetivo era representar essas funcionalidades utilizando UML para modelar as classes e interfaces, e implementar essas representações em Java.

Funcionalidades Modeladas

## Reprodutor Musical:

Métodos:
tocar(): Inicia a reprodução de uma música.
pausar(): Pausa a reprodução.
selecionarMusica(String musica): Seleciona uma música para tocar.

## Aparelho Telefônico:

Métodos:
ligar(String numero): Realiza uma chamada para o número informado.
atender(): Atende uma chamada.
iniciarCorreioVoz(): Inicia o correio de voz.

## Navegador na Internet:

Métodos:
exibirPagina(String url): Exibe uma página da web.
adicionarNovaAba(): Abre uma nova aba no navegador.
atualizarPagina(): Atualiza a página atual.


## Estrutura do Projeto
O projeto foi estruturado em três interfaces, cada uma representando uma funcionalidade, e uma classe iPhone que implementa todas as interfaces.

Arquivos:
ReprodutorMusical.java: Interface para funcionalidades de reprodução de música.
AparelhoTelefonico.java: Interface para funcionalidades de telefonia.
NavegadorInternet.java: Interface para funcionalidades de navegação na web.
iPhone.java: Classe que implementa as três interfaces e reúne as funcionalidades do iPhone.
Exemplo de Uso
No arquivo iPhone.java, incluímos um exemplo no método main para testar as funcionalidades:


## Tecnologias Utilizadas

Java: Linguagem de programação utilizada para implementar o projeto.

UML: Modelagem de classes e interfaces.

Draw.io: Sintaxe utilizada para o diagrama UML no README.

## Como Executar o Projeto

1. Clone o repositório para sua máquina local:
git clone https://github.com/JeanGomes01/componente-Iphone.git

2. Navegue até a pasta do projeto:
cd seu-repositorio

3. Compile os arquivos Java:
javac *.java

4. Execute o programa:
java iPhone
