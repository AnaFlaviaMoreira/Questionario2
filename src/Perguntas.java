public class Perguntas {
    public static void main(String[] args) {
        int acertos = 0;
        int erros = 0;
        int totalQuestoes = 15;
        Questao[] questoes = new Questao[totalQuestoes];

        // Questão 1
        questoes[0] = new Questao();
        questoes[0].pergunta = "1 - Qual dos seguintes gráficos é mais adequado para mostrar a variação de dados ao longo do tempo?";
        questoes[0].opcaoA = "a) Gráfico de barras";
        questoes[0].opcaoB = "b) Gráfico de linhas";
        questoes[0].opcaoC = "c) Gráfico de pizza";
        questoes[0].opcaoD = "d) Gráfico de dispersão";
        questoes[0].opcaoE = "e) Histograma";
        questoes[0].correta = "b";

        // Questão 2
        questoes[1] = new Questao();
        questoes[1].pergunta = "2 - Em um gráfico de barras, o que as barras representam?";
        questoes[1].opcaoA = "a) Proporções";
        questoes[1].opcaoB = "b) Frequências";
        questoes[1].opcaoC = "c) Categorias";
        questoes[1].opcaoD = "d) Valores";
        questoes[1].opcaoE = "e) Títulos";
        questoes[1].correta = "c";

        // Questão 3
        questoes[2] = new Questao();
        questoes[2].pergunta = "3 - Qual dos seguintes gráficos é mais utilizado para exibir a relação entre duas variáveis?";
        questoes[2].opcaoA = "a) Gráfico de barras";
        questoes[2].opcaoB = "b) Gráfico de linhas";
        questoes[2].opcaoC = "c) Gráfico de pizza";
        questoes[2].opcaoD = "d) Gráfico de dispersão";
        questoes[2].opcaoE = "e) Gráfico de setores";
        questoes[2].correta = "d";

        // Questão 4
        questoes[3] = new Questao();
        questoes[3].pergunta = "4 - Qual é a principal função de um gráfico de pizza?";
        questoes[3].opcaoA = "a) Mostrar a relação entre variáveis";
        questoes[3].opcaoB = "b) Mostrar proporções";
        questoes[3].opcaoC = "c) Comparar categorias";
        questoes[3].opcaoD = "d) Exibir frequência";
        questoes[3].opcaoE = "e) Exibir distribuição";
        questoes[3].correta = "b";

        // Questão 5
        questoes[4] = new Questao();
        questoes[4].pergunta = "5 - Qual gráfico é mais adequado para exibir a distribuição de frequências?*";
        questoes[4].opcaoA = "a) Gráfico de barras";
        questoes[4].opcaoB = "b) Gráfico de linhas";
        questoes[4].opcaoC = "c) Histograma";
        questoes[4].opcaoD = "d) Gráfico de dispersão";
        questoes[4].opcaoE = "e) Gráfico de setores";
        questoes[4].correta = "c";

        // Questão 6
        questoes[5] = new Questao();
        questoes[5].pergunta = "6 - Qual tipo de gráfico é mais indicado para comparar categorias diferentes?";
        questoes[5].opcaoA = "a) Gráfico de pizza";
        questoes[5].opcaoB = "b) Gráfico de dispersão";
        questoes[5].opcaoC = "c) Gráfico de barras";
        questoes[5].opcaoD = "d) Gráfico de linhas";
        questoes[5].opcaoE = "e) Gráfico de radar";
        questoes[5].correta = "c";

        // Questão 7
        questoes[6] = new Questao();
        questoes[6].pergunta = "7 - Em um gráfico de linhas, o que os pontos conectados representam?";
        questoes[6].opcaoA = "a) Frequência";
        questoes[6].opcaoB = "b) Valores categóricos";
        questoes[6].opcaoC = "c) Mudança ao longo do tempo";
        questoes[6].opcaoD = "d) Proporções";
        questoes[6].opcaoE = "e) Comparação de dados";
        questoes[6].correta = "c";

        // Questão 8
        questoes[7] = new Questao();
        questoes[7].pergunta = "8 - Qual dos gráficos abaixo é mais adequado para mostrar proporções?";
        questoes[7].opcaoA = "a) Gráfico de barras";
        questoes[7].opcaoB = "b) Gráfico de pizza";
        questoes[7].opcaoC = "c) Gráfico de linhas";
        questoes[7].opcaoD = "d) Gráfico de radar";
        questoes[7].opcaoE = "e) Gráfico de dispersão";
        questoes[7].correta = "b";

        // Questão 9
        questoes[8] = new Questao();
        questoes[8].pergunta = "9 - Um histograma é útil para exibir qual tipo de dados?";
        questoes[8].opcaoA = "a) Dados contínuos";
        questoes[8].opcaoB = "b) Dados categóricos";
        questoes[8].opcaoC = "c) Proporções";
        questoes[8].opcaoD = "d) Frequências";
        questoes[8].opcaoE = "e) Relação entre variáveis";
        questoes[8].correta = "d";

        // Questão 10
        questoes[9] = new Questao();
        questoes[9].pergunta = "10 - O que caracteriza um gráfico de dispersão?";
        questoes[9].opcaoA = "a) Pontos conectados";
        questoes[9].opcaoB = "b) Barras coloridas";
        questoes[9].opcaoC = "c) Distribuição de dados";
        questoes[9].opcaoD = "d) Comparação de categorias";
        questoes[9].opcaoE = "e) Exibição de proporções";
        questoes[9].correta = "e";

        // Questão 11
        questoes[10] = new Questao();
        questoes[10].pergunta = "11 - Qual tipo de gráfico pode ser usado para exibir a frequência acumulada?";
        questoes[10].opcaoA = "a) Histograma";
        questoes[10].opcaoB = "b) Gráfico de setores";
        questoes[10].opcaoC = "c) Gráfico de linhas";
        questoes[10].opcaoD = "d) Ogiva";
        questoes[10].opcaoE = "e) Gráfico de dispersão";
        questoes[10].correta = "d";

        // Questão 12
        questoes[11] = new Questao();
        questoes[11].pergunta = "12 - Em um gráfico de barras, o comprimento da barra indica:";
        questoes[11].opcaoA = "a) A quantidade de dados";
        questoes[11].opcaoB = "b) O valor da variável";
        questoes[11].opcaoC = "c) A frequência";
        questoes[11].opcaoD = "d) O número de categorias";
        questoes[11].opcaoE = "e) A proporção";
        questoes[11].correta = "b";

        // Questão 13
        questoes[12] = new Questao();
        questoes[12].pergunta = "13 - Qual gráfico é mais adequado para exibir mudanças ao longo de um período contínuo?";
        questoes[12].opcaoA = "a) Gráfico de pizza";
        questoes[12].opcaoB = "b) Gráfico de linhas";
        questoes[12].opcaoC = "c) Gráfico de barras";
        questoes[12].opcaoD = "d) Gráfico de radar";
        questoes[12].opcaoE = "e) Histograma";
        questoes[12].correta = "b";

        // Questão 14
        questoes[13] = new Questao();
        questoes[13].pergunta = "14 - Um gráfico de setores (pizza) deve ser utilizado quando queremos:";
        questoes[13].opcaoA = "a) Mostrar proporções de um total";
        questoes[13].opcaoB = "b) Exibir dados temporais";
        questoes[13].opcaoC = "c) Comparar distribuições";
        questoes[13].opcaoD = "d) Mostrar relação entre variáveis";
        questoes[13].opcaoE = "e) Exibir frequências acumuladas";
        questoes[13].correta = "a";

        // Questão 15
        questoes[14] = new Questao();
        questoes[14].pergunta = "15 - Qual gráfico é mais indicado para mostrar tendências de dados ao longo do tempo?";
        questoes[14].opcaoA = "a) Gráfico de barras";
        questoes[14].opcaoB = "b) Gráfico de dispersão";
        questoes[14].opcaoC = "c) Gráfico de linhas";
        questoes[14].opcaoD = "d) Gráfico de Histograma";
        questoes[14].opcaoE = "e) Gráfico de pizza";
        questoes[14].correta = "c";

        // Lógica para responder às questões
        for (int i = 0; i < totalQuestoes; i++) {
            questoes[i].escrevaQuestao();
            String respostaUsuario = questoes[i].leiaResposta();
            if (questoes[i].isCorreta(respostaUsuario)) {
                acertos++;
            } else {
                erros++;
            }
        }

        // Calculando a porcentagem de acertos
        double porcentagemAcertos = ((double) acertos / totalQuestoes) * 100;

        // Exibindo o resultado final
        System.out.println("Resultado Final:");
        System.out.println("Você acertou " + acertos + " questões.");
        System.out.println("Você errou " + erros + " questões.");
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagemAcertos);
    }
}
