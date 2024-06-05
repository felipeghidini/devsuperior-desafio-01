# DESAFIO: Componentes e injeção de dependência

Você deve criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem
de desconto e o frete. O cálculo do valor total do pedido consiste em aplicar o desconto ao valor
básico do pedido, e adicionar o valor do frete. A regra para cálculo do frete é a seguinte:

![image](https://github.com/felipeghidini/devsuperior-desafio-01/assets/49081674/24398568-6eac-48fa-bd22-cddec2290b37)

Sua solução deverá seguir as seguintes especificações:
Um pedido deve ser representado por um objeto conforme projeto abaixo:

![image](https://github.com/felipeghidini/devsuperior-desafio-01/assets/49081674/f5d93000-23e5-4066-a96e-4323327f9d04)

A lógica do cálculo do valor total do pedido deve ser implementada por componentes (serviços), cada
um com sua responsabilidade, conforme projeto abaixo:

![image](https://github.com/felipeghidini/devsuperior-desafio-01/assets/49081674/8d7632f9-f481-4ed6-bae3-f996f0087309)

Serviço OrderService: responsável por operações referentes a pedidos.
Serviço ShippingService: responsável por operações referentes a frete.
Sua solução deverá ser implementada em Java com Spring Boot. A saída deverá ser mostrada no log
do terminal da aplicação. Cada serviço deve ser implementado como um componente registrado com
@Service.
