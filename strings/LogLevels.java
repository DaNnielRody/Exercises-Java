package strings;

/*
You have three tasks, each of which will take a log line and ask you to do something with it.

Implement the (static) LogLevels.message() method to return a log line's message:

1 - LogLevels.message("[ERROR]: Invalid operation")
// => "Invalid operation"
Any leading or trailing white space should be removed:

Implement the (static) LogLevels.logLevel() method to return a log line's log level, which should be returned in lowercase:

2 - LogLevels.logLevel("[ERROR]: Invalid operation")
// => "error"

Implement the (static) LogLevels.reformat() method that reformats the log line, putting the message first and the log level after it in parentheses:

3 - LogLevels.reformat("[INFO]: Operation completed")
// => "Operation completed (info)"
 */

public class LogLevels {

    public static String message(String logLine) {
        /*
        o split funciona tipo: ei, me dê um delimitador que eu vou dividir a sua mensagem a partir dele.
        como o nosso delimitador são os dois pontos, as strings vão ser divididas entre antes dos :, e depois deles
         */
        String[] logLines = logLine.split(":", 2); // divide a mensagem anterior em substrings, removendo o padrão regex que eu selecinoar até o limite definido.
        return logLines[1].trim(); // com as mensagens divididas, posso mostrar apenas a parte que quero (depois da mensagem de erro)
    }

    public static String logLevel(String logLine) {
        // quando não usamos o limitador do split, podemos produrar por toda a string e remover todos os padrões
        String[] logLines = logLine.split("[\\[\\]:]"); // este padrão regex remove ":" e "[]".
        return logLines[1].trim().toLowerCase();
    }

    public static String reformat(String logLine) {

        String[] logParts = logLine.split(":");
        // como já fizemos o split em 2 partes - 0 e 1 - podemos simplesmente tirar agora o colchete e colocar o parênteses
        String typeError = logParts[0].toLowerCase().replace("[", "(").replace("]", ")");
        String message = logParts[1].trim();
        // e no final concatenar com a ordem contrária para ter o retorno requerido
        return message.concat(" ").concat(typeError);
    }

    public static void main(String[] args) {
        System.out.println(reformat("[INFO]: Operation completed"));
    }
}

