import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }
    
    static void imprimirSelecionados(){
        
        String[] candidatos = {"Felipe", "Marcia", "Julio", "Jose","Raul"};
        System.out.println("Lista de aprovados");
        for(int indice = 0; indice<candidatos.length; indice ++){
            System.out.println("O candidato " + (indice+1) + " foi "   +  candidatos[indice]);
        }
        
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Marcia", "Julio", "Jose", "Raul", "Lumena", "Cintia", "Adriana", "Severina", "Marcos"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Enviar contraproposta");
        } else {
            System.out.println("Aguardando demais candidatos");
        }
    }
}

