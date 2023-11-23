package arquivos;

import classes.Veiculos;
import paineis.List;

import javax.swing.*;
import java.io.*;

public class LerEscrverArquivo {

    public void escreverArquivo(List<Veiculos> veiculos) {
        FileOutputStream saida;

        try {
            saida = new FileOutputStream("Veiculos.bin");
            ObjectOutputStream objeto = new ObjectOutputStream(saida);
            objeto.writeObject(veiculos);
            objeto.close();
            JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso");

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado",
                    "Arquivo", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Veiculos> lerArquivo () {
        List<Veiculos> veiculos = null;
        try{
            FileInputStream entrada = new FileInputStream("Veiculos.bin");
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            veiculos = (List<Veiculos>) objeto.readObject();
            objeto.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado",
                    "Arquivo", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Arquivo corrompido!",
                    "Arquivo", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Classe não encontrada",
            "Arquivo", JOptionPane.ERROR_MESSAGE);
        }
        return veiculos;
    }
}
