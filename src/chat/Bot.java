package chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame {

	private static final long serialVersionUID = 1L;

	// dictionary
	private static Map<String, String> dictionary = new HashMap<String, String>();

	// area
	private JTextField txtEnter = new JTextField();
	private JTextArea txtChat = new JTextArea();

	public Bot() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Java AI");

		txtEnter.setLocation(2, 540);
		txtEnter.setSize(590, 30);

		txtChat.setLocation(15, 5);
		txtChat.setSize(560, 510);
		txtChat.setEditable(false);

		this.add(txtEnter);
		this.add(txtChat);

		// action
		txtEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String uText = txtEnter.getText();
				txtChat.append("You: " + uText + "\n");

				if (dictionary.containsKey(uText)) {
					botSay(dictionary.get(uText));
					txtEnter.setText("");

				} else {
					botSay("eu nao entendi");
					txtEnter.setText("");
				}
				uText = txtEnter.getText();
				txtChat.append("You: " + uText + "\n");

			}
		});

	}

	public void botSay(String s) {
		txtChat.append("AI: " + s + "\n");
	}

	public static void main(String[] args) {
		dictionary.put("como vai voce", "eu vou bem e voce?");
		dictionary.put("quem e voce", "eu sou o john, um chatbot");
		dictionary.put("voce gosta de filmes", "sim, eu adoro filmes");
		dictionary.put("voce gosta de esporte", "sou muito sedentario");
		dictionary.put("voce e estudante", "nao sou estudante");
		dictionary.put("voce gosta de musicas", "gosto muito musicas");
		dictionary.put("que dia e hoje", new Date().toString());
		dictionary.put("conte me uma piada", "qual o unico prato que ninguem consegue fazer direto...\n a torta");
		dictionary.put("qual o sentido da vida", "deixo essas questoes existenciais para os humanos");
		dictionary.put("estou sozinho", "teoricamente sim");
		dictionary.put("qual seu filme favorito", "matrix");
		dictionary.put("qual seu estilo musical", "rock");
		dictionary.put("voce toca instrumento musical", "nao");
		dictionary.put("qual sua serie favorita", "jessica jones");
		dictionary.put("qual seu estilo musical", "rock");
		dictionary.put("qual sua cor favorita", "verde");
		dictionary.put("qual seu estilo musical", "rock");
		dictionary.put("voce gosta de animais", "sim, principalmente cachorros");
		dictionary.put("qual seu jogo do momento", "far cry");
		dictionary.put("voce gosta gatos", "nao muito");
		dictionary.put("voce acredita em deus", "sim");
		dictionary.put("voce trabalho com o que", "responder perguntas tolas");
		dictionary.put("cante uma musica", "hum... nao");
		dictionary.put("voce gosta de estudar", "acho que nao preciso");
		dictionary.put("quem e sergey brin", "um dos caras que fez da google acontecer");
		dictionary.put("quem e bill gates", "ele fez microsoft");
		dictionary.put("quem foi steve jobs", "ele fez a apple, iphones, ipads e um monte de coisas chiques e caras");
		dictionary.put("quem e bolsonaro", "nosso presidente do brasil");
		dictionary.put("quem e obama", "foi um dos presidentes do estados unidos");
		dictionary.put("quem e donald trump", "um cara muito rico que virou presidente dos estados unindos");
		dictionary.put("voce gosta de motos", "sim, mas acho muito perigoso");
		dictionary.put("voce gosta de carros", "prefiro caminhoes");
		dictionary.put("voce gosta de game of thrones", "ja ta começando a encher o saco");
		dictionary.put("voce gosta de exterminador do futuro", "meu segundo filme favorito");
		dictionary.put("pitomba", "acerola");
		dictionary.put("acerola", "pitanga");
		dictionary.put("pitanga", "camila");
		dictionary.put("camila", "ah... chega disso");
		dictionary.put("quem veio primeiro o ovo ou a galinha", "o dinossauro");
		dictionary.put("papai noel existe", "somente no polo norte");
		dictionary.put("coelho da pascoa existe", "so se for aqueles do churrasco em abril");
		dictionary.put("por que o ceu e azul", "por causa dos gases atmosfericos ricos em oxigenio... firulas, dai brilha azul");
		dictionary.put("por que marte e vermelho", "ta, acho que e porque tem pouco oxigenio");
		dictionary.put("plutao e um planeta", "ah nao!");
		dictionary.put("fantasmas existem", "esse cara ai atras");
		dictionary.put("qual o sinonimo de sinonimo", "um palavra que substitui a outra, fazendo o mesmo sentido ou mais ou menos parecida, nao necessariamente do mesmo tamanho ou pronuncia semelhante... mas no fim tudo tem que fazer sentido");
		dictionary.put("quem veio primeiro a abobora ou a fruta", "nosso presidente do brasil");
		dictionary.put("quem veio primeiro a laranja ou a fruta", "nosso presidente do brasil");
		dictionary.put("quem veio primeiro o limao ou a fruta", "nosso presidente do brasil");
		dictionary.put("por que chamamos de xixi o xixi", "ah vai mijar!");
		
				
		new Bot();
	}

}
