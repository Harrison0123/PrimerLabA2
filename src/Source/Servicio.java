/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import javax.swing.JOptionPane;

/**
 *
 * @author lmejiaf
 */
public class Servicio extends javax.swing.JPanel {

    /**
     * Creates new form Servicio
     */
    String[][] Matriz = {{"y", "ni", "no", "e", "tanto", "así", "igual", "lo", "mas", "pero", "sino", "mientras", "aunque", "aun", "o", "ya", "bien", "porque", "como", "sin"},
    {"verdad", "derecho", "tú", "da", "don", "problema", "dar", "alguna", "pueblo", "cuando", "mal", "por", "entre", "se", "menos", "modo", "forma", "luego", "yo", "tú"},
    {"el", "ella", "eso", "aquello", "ellos", "nosotros", "sin", "embargo", "le", "hasta", "somos", "te", "té", "amo", "cuanto", "cuando", "nosotras", "ellas", "la", "es"},
    {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "resultado", "eres", "calidad", "nuevas", "organización", "serie", "necesidad", "comunidad", "central", "figura", "siguiente"},
    {"investigacion", "aire", "valor", "necesario", "efecto", "capacidad", "gonzáles", "atención", "educación", "resultados", "cerca", "sigue", "posibilidad", "esteban", "nuevos", "hacía", "soy", "pronto", "mes", "futuro"},
    {"joven", "difícil", "niño", "uso", "bueno", "actividad", "puntos", "llegó", "visto", "movimiento", "etc", "edad", "cara", "existe", "ninguna", "miembros", "grupos", "julio", "interés", "personal"},
    {"consejo", "datos", "deben", "medida", "imagen", "sector", "paz", "arte", "primeros", "mediante", "media", "alto", "anterior", "cultura", "siendo", "principio", "haya", "servicios", "salud", "estudio"},
    {"empresas", "población", "actual", "ir", "medios", "espacio", "relaciones", "libertad", "europa", "ambos", "capital", "base", "cero", "dado", "diferentes", "especial", "idea", "barcelona", "demás", "papel"},
    {"dirección", "fondo", "quién", "0", "camino", "producción", "minutos", "dio", "hablar", "estoy", "ciento", "última", "hijo", "servicio", "antonio", "comisión", "dinero", "tema", "presencia", "niños"},
    {"ex", "razón", "obra", "saber", "hubiera", "buen", "campo", "vista", "ningún", "música", "tampoco", "interior", "calle", "sabe", "zona", "pesar", "puerta", "policía", "amor", "acción"},
    {"único", "solo", "fuerza", "méxico", "condiciones", "española", "c", "dio", "s", "tengo", "creo", "total", "últimos", "personas", "político", "igual", "libro", "propia", "ahí", "1"},
    {"puesto", "empresa", "segunda", "esas", "van", "internacional", "palabras", "programa", "aquella", "quiere", "buena", "español", "orden", "hola", "éste", "iba", "claro", "luz", "mayoría", "mercado"},
    {"proyecto", "quienes", "mil", "señor", "paso", "voz", "sé", "real", "varios", "semana", "respecto", "tuvo", "algún", "trata", "mal", "hemos", "seguridad", "primero", "cosa", "ministro"},
    {"propio", "llegar", "falta", "partir", "largo", "familia", "podía", "nivel", "manos", "casos", "cierto", "dicho", "director", "segundo", "2", "equipo", "tierra", "cuanto", "luis", "aquel"},
    {"cabeza", "3", "junto", "sería", "podría", "unidos", "María", "Harry", "Pipe", "Rocío", "Luis", "David", "Mery", "María", "Juztyn", "4", "5", "6", "7", "8"},
    {"9", "10", "menos", "según", "país", "gran", "sido", "dijo", "sí", "tres", "ella", "tanto", "día", "siempre", "durante", "tan", "gobierno", "otra", "hace", "eso"},
    {"esa", "aunque", "otros", "después", "otra", "vida", "cada", "ahora", "ese", "mismo", "tiempo", "bien", "donde", "uno", "él", "tiene", "parte", "ni", "nos", "así"},
    {"todos", "puede", "vez", "hay", "yo", "han", "sólo", "qué", "porque", "mi", "está", "desde", "desde", "hasta", "años", "muy", "era", "había", "fue", "también"},
    {"dos", "son", "ser", "esta", "todo", "cuando", "entre", "ya", "este", "sobre", "sin", "si", "me", "ha", "le", "sus", "pero", "o", "más", "como"},
    {"lo", "alv", "es", "para", "su", "una", "no", "con", "por", "un", "las", "del", "se", "los", "entrelazado", "botella", "lápiz", "alguna", "bestia", "aluminio"}};

    String morse[] = new String[37];

    String letras[] = new String[37];

    public Servicio() {
        initComponents();
        morse[0] = ".-"; 		//a
        morse[1] = "-...";		//b
        morse[2] = "-.-.";		//c
        morse[3] = "-..";		//d
        morse[4] = ".";		        //e
        morse[5] = "..-.";		//f
        morse[6] = "--.";		//g
        morse[7] = "....";		//h
        morse[8] = "..";		//i
        morse[9] = ".---";		//j
        morse[10] = "-.-";		//k
        morse[11] = ".-..";	        //l
        morse[12] = "--";		//m
        morse[13] = "-.";		//n
        morse[14] = "--.--";		//ñ
        morse[14 + 1] = "---";		//o
        morse[15 + 1] = ".--.";	         //p
        morse[16 + 1] = "--.-";	        //q
        morse[17 + 1] = ".-.";      //r
        morse[18 + 1] = "...";		//s
        morse[19 + 1] = "-";		//t
        morse[20 + 1] = "..-";		//u
        morse[21 + 1] = "...-";	//v
        morse[22 + 1] = ".--";		//w
        morse[23 + 1] = "-..-";	//x
        morse[24 + 1] = "-.--";	//y
        morse[25 + 1] = "--..";	//z
        morse[26 + 1] = "-----";	//0
        morse[27 + 1] = ".----";	//1
        morse[28 + 1] = "..---";	//2
        morse[29 + 1] = "...--";	//3
        morse[30 + 1] = "....-";	//4
        morse[31 + 1] = ".....";	//5
        morse[32 + 1] = "-....";	//6
        morse[33 + 1] = "--...";	//7
        morse[34 + 1] = "---..";	//8
        morse[35 + 1] = "----.";	//9

        letras[0] = "a"; 		//a
        letras[1] = "b";		//b
        letras[2] = "c";		//c
        letras[3] = "d";		//d
        letras[4] = "e";		//e
        letras[5] = "f";		//f
        letras[6] = "g";		//g
        letras[7] = "h";		//h
        letras[8] = "i";		//i
        letras[9] = "j";		//j
        letras[10] = "k";		//k
        letras[11] = "l";	//l
        letras[12] = "m";		//m
        letras[13] = "n";		//n
        letras[14] = "ñ";		//ñ
        letras[14 + 1] = "o";		//o
        letras[15 + 1] = "p";	//p
        letras[16 + 1] = "q";	//q
        letras[17 + 1] = "r";      //r
        letras[18 + 1] = "s";		//s
        letras[19 + 1] = "t";		//t
        letras[20 + 1] = "u";		//u
        letras[21 + 1] = "v";	//v
        letras[22 + 1] = "w";		//w
        letras[23 + 1] = "x";	//x
        letras[24 + 1] = "y";	//y
        letras[25 + 1] = "z";	//z
        letras[26 + 1] = "0";	//0
        letras[27 + 1] = "1";	//1
        letras[28 + 1] = "2";	//2
        letras[29 + 1] = "3";	//3
        letras[30 + 1] = "4";	//4
        letras[31 + 1] = "5";	//5
        letras[32 + 1] = "6";	//6
        letras[33 + 1] = "7";	//7
        letras[34 + 1] = "8";	//8
        letras[35 + 1] = "9";	//9

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Digite su cadena");

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Root-K");

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Encriptacion");

        jSpinner1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("K");

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/accept.png"))); // NOI18N
        jLabel5.setText("Aceptar");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addComponent(jSpinner1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        //validar los campos
        // todo: 1.ver si viene vacia, 2. validar simbolos, 3. validar tildes
        //1. si vene vacia
        String cadena = jTextField1.getText();
        if (cadena != null) {
            if (!cadena.isEmpty()) {

                cadena = quitarEspaciosEsquinas(cadena);
                if (hasSymbol(cadena) == false) {
                    JOptionPane.showMessageDialog(null, "La cadena contiene simbolos extraños, vuelva a digitarla");
                    jTextField1.setText("");

                }else{
                    
                }

            }
        }

    }//GEN-LAST:event_jLabel5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    public String quitarEspaciosEsquinas(String cadena) {

        int inicio = 0;
        int fin = cadena.length();
        int i = 0;
        while ((inicio < fin) && (cadena.substring(i, i + 1).equals(" "))) {
            inicio++;
            i++;
        }
        i = 0;
        while ((inicio < fin) && (cadena.substring(fin - 1, fin).equals(" "))) {
            fin--;

        }
        cadena = cadena.substring(inicio, fin);
        return cadena;
    }

    public boolean hasSymbol(String cadena) {
        int i = 0, j = 0;
        boolean valido = true;
        while (i < cadena.length()) {
            boolean valido2 = false;
            while (j < letras.length && valido2 == false) {

                if (letras[j].equals(cadena.substring(i, i + 1))) {
                    valido2 = true;
                }

                j++;
            }
            if (valido2 == false) {

                return false;
            } else {
                valido = true;
            }

            i++;
        }

        return valido;
    }

}
