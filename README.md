<html> 
    <head>
       <h1 Align="center"> Exercicio Tecelagem Proposto na aula de Java</h1>
    </head>
    <body>
        <h1>Descrição do exercicio</h1>
        <p1>Uma tecelagem tem 3 categorias de funcionários: os da administração, os da produção e os vendedores. Os funcionários da administração salário fixo. Os da produção são horistas, recebem por hora trabalhada e trabalham em turnos onde parte das horas são diurnas e parte são noturnas. Já os vendedores recebem um valor fixo mais comissão sobre as vendas. Para todos eles, a tecelagem precisa ter registrado o nome, RG e salário base. No caso dos funcionários administrativos o salário base é o salário bruto do funcionário. Para os funcionários da produção, o salário base é o valor por hora que eles recebem e para os vendedores é a parte fixa do salário.</p1>
        <br>
        <p2>Faça uma hierarquia de classes que atenda as necessidades da tecelagem, sem duplicação de código e que contenha para todos os funcionários, os seguintes métodos:</p2>
        <br>
        <br>
        <h2>double salarioLiquido( ):</h2> 
        <li>retorna o salário liquido do funcionário.</li>
        <br>
        <h2>void hollerith( ):</h2> 
        <li>imprime o hollerith do funcionário especificando seus dados, seu salário base e tudo o que foi somado ou descontado do salário, finalizando com seu salário líquido.</li>
        <br>
        <h2>void novoMes( ):</h2> 
        <li>zera as informações que são acumuladas durante o mês, iniciando o mês seguinte.</li>
        <br>
        <br>
        <h1>Para os funcionários administrativos:</h1>
        <br>
        <h2>void registrarFalta( ):</h2>
        <li>As faltas vão sendo acumuladas durante o mês e depois são descontadas do salário base para calcular o salário líquido. Cada falta desconta 1/30 do salário base. Este método incrementa em um o número de faltas. O método novoMes( ) zera a quantidade de faltas.</li>
        <br>
        <br>
        <h1>Para os funcionários da produção:</h1>
        <br>
        <h2>void registrarHorasDiurnas(int horas) e void registrarHorasNoturnas(int horas):</h2>
        <li>O número de horas diurnas e noturnas vão sendo acumulados durante o mês e usados depois para calcular o salário final do funcionário. As horas diurnas são pagas de acordo com o salário base do funcionário. As horas noturnas têm um acréscimo de 30% sobre o valor das horas diurnas. O método novoMes( ) zera a quantidade de horas diurnas e noturnas.</li>
        <br>
        <br>
        <h1>Para os vendedores</h1>
        <br>
        <h2>void registrarVenda(double valor):</h2>
        <li>As vendas de cada vendedor vão sendo acumuladas durante o mês e depois usadas para calcular seu salário líquido. Além do salário fixo, os vendedores recebem 3% de comissão sobre o valor total das vendas durante o mês. O método novoMes( ) zera o total de vendas.</li>
        <br>
        <br>
        <h2>Curso Análise e Desenvolvimento de Sistemas</h2>
        <h4>Autor: Giovanni Bellacosa</h4>
    </body>
</html>
