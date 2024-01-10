package algaworks.junit;

import org.junit.jupiter.api.*;

public class EntendendoJunitTest {

    @BeforeAll
    public static void iniciarTestes(){
        System.out.println(">>> public static void iniciarTestes() <<<");
    }

    @AfterAll
    public static void encerrarTestes(){
        System.out.println(">>> public static void encerrarTestes() <<<");
    }

    @BeforeEach
    public void iniciarTeste(){
        System.out.println(">>> public void iniciarTeste <<<");
    }

    @AfterEach
    public void encerrarTeste(){
        System.out.println(">>> public void encerrarTeste <<<");
    }

    @Test
    public void testandoAlgo(){
        String nome = String.format("%s", "Leonardo");

       Assertions.assertEquals("Leonardo", nome);
    }

    @Test
    public void testandoOutraCoisa(){
        String str =  String.format("%s", "");

        Assertions.assertTrue(str.isEmpty());
    }
}
