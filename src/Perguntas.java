public class Perguntas {
    public static void main(String[] args) {
        int acertos = 0;
        int erros = 0;
        int totalQuestoes = 15;

        Questao[] questoes = new Questao[totalQuestoes];

        // Questão 1
        questoes[0] = new Questao();
        questoes[0].pergunta = "Qual dos seguintes gráficos é mais adequado para mostrar a variação de dados ao longo do tempo?";
        questoes[0].opcaoA = "a) Gráfico de barras";
        questoes[0].opcaoB = "b) Gráfico de linhas";
        questoes[0].opcaoC = "c) Gráfico de pizza";
        questoes[0].opcaoD = "d) Gráfico de dispersão";
        questoes[0].opcaoE = "e) Histograma";
        questoes[0].correta = "b";

        // Questão 2
        questoes[1] = new Questao();
        questoes[1].pergunta = "Em um gráfico de barras, o que as barras representam?";
        questoes[1].opcaoA = "a) Proporções";
        questoes[1].opcaoB = "b) Frequências";
        questoes[1].opcaoC = "c) Categorias";
        questoes[1].opcaoD = "d) Valores";
        questoes[1].opcaoE = "e) Títulos";
        questoes[1].correta = "c";

        // Questão 3
        questoes[2] = new Questao();
        questoes[2].pergunta = "Qual dos seguintes gráficos é mais utilizado para exibir a relação entre duas variáveis?";
        questoes[2].opcaoA = "a) Gráfico de barras";
        questoes[2].opcaoB = "b) Gráfico de linhas";
        questoes[2].opcaoC = "c) Gráfico de pizza";
        questoes[2].opcaoD = "Gráfico de dispersão";
        questoes[2].opcaoE = "Gráfico de setores";
        questoes[2].correta = "d";

        // Questão 4
        questoes[3] = new Questao();
        questoes[3].pergunta = "Qual é a principal função de um gráfico de pizza?";
        questoes[3].opcaoA = "a) Mostrar a relação entre variáveis";
        questoes[3].opcaoB = "b) Mostrar proporções";
        questoes[3].opcaoC = "c) Comparar categorias";
        questoes[3].opcaoD = "d) Exibir frequência";
        questoes[3].opcaoE = "e) Exibir distribuição";
        questoes[3].correta = "b";

        // Questão 5
        questoes[4] = new Questao();
        questoes[4].pergunta = "Qual é a posição de Harry Potter no time de Quadribol?";
        questoes[4].opcaoA = "A) Batedor";
        questoes[4].opcaoB = "B) Apanhador";
        questoes[4].opcaoC = "C) Artilheiro";
        questoes[4].opcaoD = "D) Goleiro";
        questoes[4].opcaoE = "E) Nenhuma das opções";
        questoes[4].correta = "B";

        // Questão 6
        questoes[5] = new Questao();
        questoes[5].pergunta = "Qual é o nome do pai de Draco Malfoy?";
        questoes[5].opcaoA = "A) Lucius Malfoy";
        questoes[5].opcaoB = "B) Severus Snape";
        questoes[5].opcaoC = "C) Sirius Black";
        questoes[5].opcaoD = "D) Remus Lupin";
        questoes[5].opcaoE = "E) Arthur Weasley";
        questoes[5].correta = "A";

        // Questão 7
        questoes[6] = new Questao();
        questoes[6].pergunta = "Qual é o nome do professor de Poções no primeiro ano de Harry?";
        questoes[6].opcaoA = "A) Minerva McGonagall";
        questoes[6].opcaoB = "B) Filius Flitwick";
        questoes[6].opcaoC = "C) Severus Snape";
        questoes[6].opcaoD = "D) Pomona Sprout";
        questoes[6].opcaoE = "E) Gilderoy Lockhart";
        questoes[6].correta = "C";

        // Questão 8
        questoes[7] = new Questao();
        questoes[7].pergunta = "Qual é o nome do mapa que mostra todos os segredos de Hogwarts?";
        questoes[7].opcaoA = "A) Mapa do Maroto";
        questoes[7].opcaoB = "B) Mapa do Peregrino";
        questoes[7].opcaoC = "C) Mapa do Explorador";
        questoes[7].opcaoD = "D) Mapa do Viajante";
        questoes[7].opcaoE = "E) Mapa do Aventureiro";
        questoes[7].correta = "A";

        // Questão 9
        questoes[8] = new Questao();
        questoes[8].pergunta = "Qual é o nome do banco dos bruxos?";
        questoes[8].opcaoA = "A) Gringotes";
        questoes[8].opcaoB = "B) Banco de Hogwarts";
        questoes[8].opcaoC = "C) Banco de Hogsmeade";
        questoes[8].opcaoD = "D) Banco de Diagon Alley";
        questoes[8].opcaoE = "E) Banco de Beauxbatons";
        questoes[8].correta = "A";

        // Questão 10
        questoes[9] = new Questao();
        questoes[9].pergunta = "Qual é o nome do hipogrifo de Hagrid?";
        questoes[9].opcaoA = "A) Bicuço";
        questoes[9].opcaoB = "B) Norberto";
        questoes[9].opcaoC = "C) Aragog";
        questoes[9].opcaoD = "D) Fang";
        questoes[9].opcaoE = "E) Fluffy";
        questoes[9].correta = "A";

        // Questão 11
        questoes[10] = new Questao();
        questoes[10].pergunta = "Qual é o nome do jornal dos bruxos?";
        questoes[10].opcaoA = "A) O Profeta Diário";
        questoes[10].opcaoB = "B) O Correio Coruja";
        questoes[10].opcaoC = "C) O Diário de Hogwarts";
        questoes[10].opcaoD = "D) O Jornal de Hogsmeade";
        questoes[10].opcaoE = "E) O Jornal Bruxo";
        questoes[10].correta = "A";

        // Questão 12
        questoes[11] = new Questao();
        questoes[11].pergunta = "Qual é o nome do feitiço para desarmar o oponente?";
        questoes[11].opcaoA = "A) Expelliarmus";
        questoes[11].opcaoB = "B) Stupefy";
        questoes[11].opcaoC = "C) Avada Kedavra";
        questoes[11].opcaoD = "D) Crucio";
        questoes[11].opcaoE = "E) Imperio";
        questoes[11].correta = "A";

        // Questão 13
        questoes[12] = new Questao();
        questoes[12].pergunta = "Qual é o nome do feitiço que conjura um patrono?";
        questoes[12].opcaoA = "A) Expecto Patronum";
        questoes[12].opcaoB = "B) Lumos";
        questoes[12].opcaoC = "C) Wingardium Leviosa";
        questoes[12].opcaoD = "D) Accio";
        questoes[12].opcaoE = "E) Alohomora";
        questoes[12].correta = "A";

        // Questão 14
        questoes[13] = new Questao();
        questoes[13].pergunta = "Qual é o nome do feitiço que abre portas trancadas?";
        questoes[13].opcaoA = "A) Alohomora";
        questoes[13].opcaoB = "B) Lumos";
        questoes[13].opcaoC = "C) Wingardium Leviosa";
        questoes[13].opcaoD = "D) Accio";
        questoes[13].opcaoE = "E) Expecto Patronum";
        questoes[13].correta = "A";

        // Questão 15
        questoes[14] = new Questao();
        questoes[14].pergunta = "Qual é o nome do feitiço que ilumina a ponta da varinha?";
        questoes[14].opcaoA = "A) Lumos";
        questoes[14].opcaoB = "B) Nox";
        questoes[14].opcaoC = "C) Wingardium Leviosa";
        questoes[14].opcaoD = "D) Accio";
        questoes[14].opcaoE = "E) Expecto Patronum";
        questoes[14].correta = "A";

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
