# Programa de Descontos
Programa que calcula o valor de descontos em parcelas.

### Como utilizar:

Executando o programa, será solicitado ao usuário que o mesmo informe 2 valores, o valor total da compra e a quantidade de parcelas que ele deseja.

![image](https://user-images.githubusercontent.com/12546497/208335163-c5269630-6ce5-44e1-85a5-73da1bc4963b.png)

Ao digitar esses valores e, se eles forem válidos, o sistema retornará os valor total já com o desconto aplicado, e também apresentará o valor por mensalidade e a data de vencimento de cada uma. A data de vencimento é baseada na data atual, sendo o primeiro vencimento para 30 dias após a compra.

![image](https://user-images.githubusercontent.com/12546497/208335314-c809cf51-8b33-4656-b27d-9c08a74f7e7f.png)


### Demonstração do resultado final:
### ![image](https://user-images.githubusercontent.com/12546497/208334396-e93ac6b2-901f-4374-a794-000378bafa1a.png)

### -- Pontos para futuras melhorias --

 - Criar um método para separar do programa principal o calculo de desconto, deixando assim o código da classe main mais limpo e legivel. 
 - Criar interface para facilitar a implementação de novas bases de calculo para descontos em outras situações onde a base da fórmula seja diferente da atual.
 - Criar Exceptions customizadas para capturar e tratar possiveis erros.
 - Criar testes para fortalecer a confiabilidade do programa.
