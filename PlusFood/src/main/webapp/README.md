<img src="offshore.jpg" style="display: block; margin-left: auto; margin-right: auto; width: 15%"/>
<h3 style="text-align: center; margin-top: 0px">OffShore Sistemas</h3>

**OffShore Sistemas** é uma empresa fictícia com sede na cidade de São Luís do Maranhão especializada no desenvolvimento de aplicações para comércio eletrônico (E-commerce). Seu marco inicial foi o desenvolvimento de um sistema de folha de pagamentos no ano de 1997. Atualmente possui um portfólio de clientes nas mais variadas áreas, dentre elas: gastronomia, vestuário e bebidas.

Este documento trata dos requisitos do Sistemas de Vendas On-line +Food (Plus Food) por solicitação do grupo Acme Gastronomius, parceiro de longa data da OSS.

>*Os requisitos foram simplificados para os propósitos deste projeto

#### Especificação de Requisitos

1. O Sistema deverá exibir uma mensagem de boas vindas em sua home-page e a partir desta serão apresentados ao usuário os estabelecimentos do grupo<p/>

1. A lista de restaurantes conterá informações resumidas do estabelecimento em questão: logomarca, nome empresarial, categoria, tempo médio de entrega e a média da avaliação dos clientes<p/>

1. Após a escolha de um restaurante pelo usuário, deverão ser mostrados os produtos/cardápio comercializados pelo estabelecimento escolhido contendo: a imagem do item, nome, descrição e preço, além de mais informações sobre o estabelecimento: nome de fantasia, logomarca, categoria, média da avaliação dos clientes, texto institucional e horário de funcionamento<p/>

1. O Sistema também deverá mostrar as avaliações mais recentes dos clientes contendo *avatar* do usuário, nome de usuário, avaliação/nota e um texto, opcional,  justificando tal avaliação. Deverá ser avisado que a avaliação será publicada em até 7 dias após moderação<p/>

1. Deverá ser fornecido um "carrinho de compras" que armazenará provisoriamente os itens selecionados para compra pelo usuário. O carrinho mostrará o produto escolhido (nome, quantidade comprada, preço unitário, subtotal do item), valor da taxa de entrega e total da compra. O usuário poderá "limpar" o carrinho, caso desista da compra, ou confirmar a compra<p/>

1. Quando um item for adicionado ao carrinho sua quantidade deverá ser incrementada, caso seja retirado, a quantidade deverá ser decrementada até a remoção do mesmo. O Sistema deverá informar quando o carrinho de compras estiver vazio<p/>

1. Na confirmação da compra o Sistema fornecerá um meio de o usuário informar dados relativos a entrega e opções de pagamento (<span style="color: red">necessita mais informações</span>)<p/>

1. Durante a confirmação da compra o Sistema deverá consumir serviços relativos a opção de pagamento escolhida pelo usuário, e não havendo restrições, a compra será confirmada e o pedido entrará na fila de espera do restaurante selecionado

#### Instruções
>Para simplificar, na confirmação da compra deverá ser mostrado a página de conclusão do pedido. Não será necessário implementar o sistema de avaliação dos usuários. O valor da taxa de entrega para todos os estabelecimentos será R$ 8,00.

O candidato deverá implementar os requisitos para o "carrinho de compras" e a página de conclusão de pagamento, convertendo-o para *facelets*. É <u>mandatório</u> utilizar o *layout*  fornecido.

O projeto traz um protótipo de interface gráfica que poderá ser usado para dirimir dúvidas e também onde será encontrado o arquivo da página de conclusão de pagamento em HTML.

Para este projeto foram utilizados:

Java 8<br/>
Maven 3.5.x<br/>
Git 2.17.x<br/>
Eclipse (utilizar a versão mais recente)<br/>
Wildfly 9.x (exige JRE 8.x)<br/>
JBoss Tools<br/>
Bootstrap 3.3.x<br/>
Facelets 1.1.x<br/>
JSF 1.2<br/>

>O *plugin* JBoss Tools fornece todos os artefatos necessários para a utilização do projeto<p/>
>O candidato deverá configurar o próprio ambiente de desenvolvimento<p/>
>O diretório **docs** do projeto contém informações adicionais de configuração do ambiente


<br/><br/><br/>
<span style="display:block; text-align: center;">Boa sorte!</span>