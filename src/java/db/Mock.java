/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import modelos.Produto;
import modelos.Usuario;

/**
 *
 * @author gutol
 */
public class Mock {

   public static void makeMock() {
      createUsers();
      createProducts();
   }

   private static void createUsers() {
      ArrayList<Usuario> lista;

      if (Usuario.getLista().isEmpty()) {
         lista = Usuario.getLista();

         Usuario admin = new Usuario();
         admin.setEmail("admin@ifpr.edu.br");
         admin.setSenha("admin");
         admin.setNome("Administrador");
         lista.add(admin);

         Usuario gerente = new Usuario();
         gerente.setEmail("gerente@ifpr.edu.br");
         gerente.setSenha("123");
         gerente.setNome("Fulano de Tal");
         lista.add(gerente);
      }

   }

   private static void createProducts() {
      ArrayList<Produto> lista;

      //só cria produtos com lista vazia
      if (Produto.lista.isEmpty()) {
         lista = Produto.lista;

         Produto caneca = new Produto();
         caneca.setDescricao("Caneca");
         caneca.setPreco(10.0f);
         caneca.setOferta(true);
         caneca.setImagem("https://socd.vteximg.com.br/arquivos/ids/171137-1310-1310/caneca-magica-azul-marinho-fosco.jpg?v=636404720194970000");
         caneca.setEspecificacao("A caneca perfeita para quem só funciona depois de um bom café!\n"
                 + "\n"
                 + "Feita em cerâmica, esta linda caneca pode ser usada no microondas.\n"
                 + "Dê mais esse toque de personalidade em sua cozinha!\n"
                 + "\n"
                 + "Produto original, Garantia de qualidade!\n"
                 + "\n"
                 + "- Conteúdo da embalagem: 1 caneca\n"
                 + "- Material: cerâmica\n"
                 + "- Pode ser usada no microondas\n"
                 + "- Dimensão aproximada da embalagem: 11 x 10 x 9 cm\n"
                 + "- Diâmetro da caneca: 8 cm\n"
                 + "- Capacidade: 325 ml");
         lista.add(caneca);

         Produto sulfite = new Produto();
         sulfite.setDescricao("Folha Sulfite");
         sulfite.setPreco(5.0f);
         sulfite.setOferta(true);
         sulfite.setImagem("https://http2.mlstatic.com/papel-sulfite-folha-a4-75-grs-pacote-c-500-unidades-D_NQ_NP_891083-MLB26996539385_032018-F.jpg");
         sulfite.setEspecificacao("PAPEL SULFITE A4 75GR RESMA RINO\n"
                 + "Papel Sulfite A4 Rino, ideal para atividades do dia a dia em casa, na escola ou escritório ou para grandes volumes de impressões e cópias em equipamentos de alta velocidade.\n"
                 + "O Papel Sulfite Rino é atualmente o mais vendido, aqui na BestPlus, pode ser usado em impressoras a laser, jato de tinta em fotocopiadoras e fax. Aceita impressão frente e verso, preto e branco ou colorida.\n"
                 + "O papel sulfite rino possui selo da Cerflor (programa brasileiro de certificação florestal), reconhecido internacionalmente pelo Program for the Endorsement of Forest Certification - PEFC.\n"
                 + "Meio Ambiente:\n"
                 + "Alcalino fabricado com 100% de celulose de eucalipto, sempre tendo sua produação proveniente de florestas plantadas e sustentáveis. Para um melhor rendimento, armazene em local adequado, com temperatura ambiente, sem umidade e sem luminosidade excessiva.\n"
                 + "Características:\n"
                 + "- Marca: Rino\n"
                 + "- Modelo: A4\n"
                 + "- Quantidade: 500 Folhas A4\n"
                 + "Especificações:\n"
                 + "- Papel alcalino\n"
                 + "- Papel para Imprimir e Escrever\n"
                 + "- 100% Reciclável\n"
                 + "- Livre de Cloro\n"
                 + "- Formato A4: (21x29,7cm)\n"
                 + "- Gramatura: 75 g/m²\n"
                 + "Informações de Acordo com o Fabricante");
         lista.add(sulfite);

         Produto caneta = new Produto();
         caneta.setDescricao("Caneta Bic");
         caneta.setPreco(1.5f);
         caneta.setOferta(true);
         caneta.setImagem("http://www.bavatos.com.br/content/images/thumbs/0001016_caneta-esf-cristal-azul-bic_580.jpeg");
         caneta.setEspecificacao("Caneta esferográfica Bic, na cor azul. Disponível na cor azul. Fabricado por Bic.\n"
                 + "especificacoes: Conteúdo: Caneta esferográfica Bic\n"
                 + "Cor: Azul\n"
                 + "Fabricante: Bic");
         lista.add(caneta);

         Produto caderno = new Produto();
         caderno.setDescricao("Caderno Universitário");
         caderno.setPreco(5.5f);
         caderno.setOferta(true);
         caderno.setImagem("https://images-americanas.b2w.io/produtos/01/00/item/117675/0/117675010_1GG.jpg");
         caderno.setEspecificacao("Cores fortes, vibrantes e tons fluorescentes não poderiam faltar em seus estudos! O Caderno Universitário Tilibra Neon possui capa em polipropileno, 1 matéria, 96 folhas, e bolsa portfólio. Produto certificado FSC. Para cada estilo e necessidade, existe um Tilibra para você!");
         lista.add(caderno);

         Produto lapis = new Produto();
         lapis.setDescricao("Lapis De Cor Faber-castell");
         lapis.setPreco(1.0f);
         lapis.setOferta(true);
         lapis.setImagem("https://http2.mlstatic.com/lapis-de-cor-faber-castell-24-cores-6-tons-de-pele-D_NQ_NP_743837-MLB32775750603_112019-O.webp");
         lapis.setEspecificacao("O Ecolápis Caras & Cores foram desenvolvidos para celebrar a diversidade e a inclusão. São 6 tons de peles diferentes e misturáveis, que estimulam a criatividade e a autoexpressão através de novas combinações. Conheça tutoriais com conteúdos exclusivos acessando o QRcode presente na embalagem.\n"
                 + "\n"
                 + " \n"
                 + "\n"
                 + "- 24 cores regulares + 6 tons de pele\n"
                 + "\n"
                 + "- Cores vivas e ótima cobertura\n"
                 + "\n"
                 + "- Produzidos com madeira 100% reflorestada e certificada pelo FSC: respeito ao meio ambiente.");
         lista.add(lapis);

         Produto iPhone = new Produto();
         iPhone.setDescricao("iPhone 8");
         iPhone.setPreco(1.5f);
         iPhone.setOferta(true);
         iPhone.setImagem("https://images-americanas.b2w.io/produtos/01/00/img/338835/8/338835865_1GG.jpg");
         iPhone.setEspecificacao("iPhone 8 128GB Gold iOS Câmera 12MP 4G Wi-Fi – Apple.");
         lista.add(iPhone);

         Produto PlayStation = new Produto();
         PlayStation.setDescricao("PlayStation 4");
         PlayStation.setPreco(5.0f);
         PlayStation.setOferta(true);
         PlayStation.setImagem("https://www.sony.com.br/image/4dcdfc5416b7185bb72d9d1baa260053?fmt=pjpeg&wid=165&bgcolor=FFFFFF&bgc=FFFFFF");
         PlayStation.setEspecificacao("Mais leve e mais fino, o sistema PlayStation 4 tem disco rígido de 1TB para tudo o que há de melhor em jogos, músicas e muito mais! O pacote PlayStation Hits oferece jogos incríveis que proporcionarão entretenimento sem fim com jogos dinâmicos e conectados, gráficos e velocidade intensos, personalização inteligente, recursos sociais integrados intensamente e inovadores recursos de segunda tela.\n"
                 + "\n"
                 + "Combina conteúdo sem igual, experiências de jogos imersivas, todos os seus aplicativos favoritos de entretenimento digital e recursos exclusivos do PlayStation. O PS4 é centrado nos jogadores, possibilitando que eles joguem quando, onde e como quiserem, possibilita que os maiores desenvolvedores de jogos do mundo deem asas à sua criatividade e transcendam os limites do ato de jogar por meio de um sistema que é ajustado especialmente para suas necessidades.");
         lista.add(PlayStation);

         Produto PCgamer = new Produto();
         PCgamer.setDescricao("Pc Gamer");
         PCgamer.setPreco(5.0f);
         PCgamer.setOferta(true);
         PCgamer.setImagem("https://images-americanas.b2w.io/produtos/01/00/img13/412767/5/412767523_1GG.jpg");
         PCgamer.setEspecificacao("Com a linha Roda Tudo você poderá adquirir um Pc Gamer de baixo custo que está pronto para executar os jogos mais famosos do momento.\n"
                 + "É indicado e um excelente investimento para você que está ingressando no universo gamer, quer começar a jogar agora mas está com limitação no orçamento.\n"
                 + "Ele também é ótimo para a edição ou execução de vídeos ou filmes em alta resolução.");
         lista.add(PCgamer);

         Produto NintendoSwitch = new Produto();
         NintendoSwitch.setDescricao("Nintendo Switch");
         NintendoSwitch.setPreco(5.0f);
         NintendoSwitch.setOferta(true);
         NintendoSwitch.setImagem("https://target.scene7.com/is/image/Target/GUEST_5561e25a-a986-4b57-bba4-ee339796ae89?wid=325&hei=325&qlt=80&fmt=webp");
         NintendoSwitch.setEspecificacao("A Nintendo anunciou um modelo atualizado do console que difere do modelo original na longevidade da bateria. Enquanto o modelo original da Nintendo Switch tem uma bateria que dura entre 2.5 a 6.5 horas, o modelo atualizado tem uma bateria que dura entre 4.5 a 9 horas. É uma diferença considerável. No caso específico de The Legend of Zelda: Breath of the Wild, a bateria da Switch original permite jogar durante 3 horas. A bateria do novo modelo permite jogar durante 5.5 horas. Itens Inclusos: 01 - Console Nintendo Switch 01 - Nintendo Switch dock 01 - Joy-Con Azul Neon (Esquerdo) e Joy-Con Vermelho Neon (Direito) 01 - Dois acessórios de pulso Joy-Con 01 - Grip Joy-Con 01 - Cabo HDMI 01 - Adaptador de Força Nintendo Switch");
         lista.add(NintendoSwitch);

         Produto SmartTV = new Produto();
         SmartTV.setDescricao("Smart TV");
         SmartTV.setPreco(5.0f);
         SmartTV.setOferta(true);
         SmartTV.setImagem("https://images-americanas.b2w.io/produtos/01/00/offers/01/02/item/133791/1/133791184_1GG.png");
         SmartTV.setEspecificacao("Smart TV LED 50” Sony KDL-50W665F Full HD - Wi-Fi HDR 2 HDMI 2 USB\n"
                 + "A Smart TV LED Full HD KDL-50W665F de 50\" da Sony reproduz a emoção dos programas e filmes em HDR. Ela é compatível com uma variedade de formatos HDR, incluindo HDR10 e Hybrid Log-Gamma. Possuisistema operacional Linux, conta com Wi-Fi integrado, 2 entradas HDMI e 2 USB. A tela é enquadrada com uma borda fina e estreita que maximiza a área de visão. Seu efeito em alumínio oferece à TV uma aparência elegante e refinada.");
         lista.add(SmartTV);

         Produto Sofá = new Produto();
         Sofá.setDescricao("Sofá");
         Sofá.setPreco(5.0f);
         Sofá.setOferta(true);
         Sofá.setImagem("https://www.casasbahia-imagens.com.br/Moveis/SaladeEstar/Sofas/9095762/456895098/sofa-4-lugares-linoforte-versalhes-com-assento-retratil-e-encosto-reclinavel-em-tecido-suede-9095759.jpg");
         Sofá.setEspecificacao("Conte com o Sofá 4 Lugares Linoforte Versalhes com Assento Retrátil e Encosto Reclinável em Tecido Suede para deixar a sua sala de estar muito mais confortável e sofisticada para receber os seus familiares, assistir muitos filmes ou mesmo fazer uma longa maratona do seu seriado preferido.\n"
                 + "\n"
                 + "Elaborado com um design moderno, ele possui estrutura com Madeira de reflorestamento (Eucalipto e Pinus) seca e tratada e de alta qualidade, sistemas flexíveis compostos por percintas elásticas, almofadas fixas, pés com excelente durabilidade, assento retrátil e encosto reclinável.\n"
                 + "\n"
                 + "Os móveis Linoforte são perfeitos para todos os ambientes do seu lar!");
         lista.add(Sofá);

         Produto Teclado = new Produto();
         Teclado.setDescricao("Teclado e Mouse Sem Fio");
         Teclado.setPreco(5.0f);
         Teclado.setOferta(true);
         Teclado.setImagem("https://images7.kabum.com.br/produtos/fotos/90237/90237_1524230401_index_gg.jpg");
         Teclado.setEspecificacao("Combo Teclado e Mouse Sem Fio de Entrada Multimídia USB Preto - TC212.");
         lista.add(Teclado);

      }
   }

}
