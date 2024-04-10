package jogodavelha;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class JogoDaVelha extends JFrame{
    
    JButton[] btn = new JButton[9];
    JLabel placar = new JLabel("PLACAR:");
    JLabel px = new JLabel("X - 0");
    JLabel po = new JLabel("O - 0");
    JButton novo = new JButton("Novo jogo");
    JButton zerar = new JButton("Zerar placar");
    int PX = 0;
    int PO = 0;
    boolean xo = false;
    boolean[] click = new boolean[9];
    
    public JogoDaVelha(){
        setVisible(true);
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(290,100,800,500);
        add(placar);
        add(px);
        add(po);
        add(novo);
        add(zerar);
        placar.setBounds(533,70,100,30);
        placar.setFont(new Font ("Segoe UI", Font.BOLD,20));
        px.setBounds(500,110,100,30);
        px.setFont(new Font ("Segoe UI", Font.BOLD,17));
        po.setBounds(608,110,100,30);
        po.setFont(new Font ("Segoe UI", Font.BOLD,17));
        novo.setBounds(513,160,120,30);
        zerar.setBounds(513,200,120,30);
        
        novo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpar();
            }
        });
        zerar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PO = 0;
                PX = 0;
                atualizar();
            }
        });
        
        int cont = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                btn[cont] = new JButton();
                add(btn[cont]);        
                btn[cont].setBounds((100 * i) + 90,(100 * j) + 80, 90, 90);
                btn[cont].setFont(new Font("Arial", Font.BOLD,30));
                cont++; 
            }
        }
        
        for(int i = 0; i < 9; i++){
            click[i] = false;
        }
               
        btn[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[0] == false){
                    click[0] = true;
                    mudar(btn[0]);
                }
            }
        });
        
        btn[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[1] == false){
                    click[1] = true;
                    mudar(btn[1]);
                }
            }
        });
        
        btn[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[2] == false){
                    click[2] = true;
                    mudar(btn[2]);
                }
            }
        });
        
        btn[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[3] == false){
                    click[3] = true;
                    mudar(btn[3]);
                }
            }
        });
        
        btn[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[4] == false){
                    click[4] = true;
                    mudar(btn[4]);
                }
            }
        });
        
        btn[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[5] == false){
                    click[5] = true;
                    mudar(btn[5]);
                }
            }
        });
        
        btn[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[6] == false){
                    click[6]= true;
                    mudar(btn[6]);
                }
            }
        });
        
        btn[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[7] == false){
                    click[7] = true;
                    mudar(btn[7]);
                }
            }
        });
        
        btn[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[8] == false){
                    click[8] = true;
                    mudar(btn[8]);
                }
            }
        });
    }
    
    public void mudar(JButton btnJ){
        if(xo){
            btnJ.setText("O");
            xo = false;
        }else {
            btnJ.setText("X");
            xo = true;
        }
        ganhou();
    }
    
    public void atualizar(){
        px.setText("X - " + PX);
        po.setText("O - " + PO);
    }
    
    public void ganhou(){
        int cont = 0;
        for (int i = 0; i < 9; i++){
            if(click[i] == true){
                cont++;
            }
        }
        if((btn[0].getText() == "X" && btn[1].getText() == "X" && btn[2].getText() == "X")
                || (btn[3].getText() == "X" && btn[4].getText() == "X" && btn[5].getText() == "X")
                || (btn[6].getText() == "X" && btn[7].getText() == "X" && btn[8].getText() == "X")
                || (btn[0].getText() == "X" && btn[3].getText() == "X" && btn[6].getText() == "X")
                || (btn[1].getText() == "X" && btn[4].getText() == "X" && btn[7].getText() == "X")
                || (btn[2].getText() == "X" && btn[5].getText() == "X" && btn[8].getText() == "X")
                || (btn[0].getText() == "X" && btn[4].getText() == "X" && btn[8].getText() == "X")
                || (btn[2].getText() == "X" && btn[4].getText() == "X" && btn[6].getText() == "X")){
            JOptionPane.showMessageDialog(null, "X Ganhou!");
            PX++;
            atualizar();
            limpar();
        }else if ((btn[0].getText() == "O" && btn[1].getText() == "O" && btn[2].getText() == "O")
                || (btn[3].getText() == "O" && btn[4].getText() == "O" && btn[5].getText() == "O")
                || (btn[6].getText() == "O" && btn[7].getText() == "O" && btn[8].getText() == "O")
                || (btn[0].getText() == "O" && btn[3].getText() == "O" && btn[6].getText() == "O")
                || (btn[1].getText() == "O" && btn[4].getText() == "O" && btn[7].getText() == "O")
                || (btn[2].getText() == "O" && btn[5].getText() == "O" && btn[8].getText() == "O")
                || (btn[0].getText() == "O" && btn[4].getText() == "O" && btn[8].getText() == "O")
                || (btn[2].getText() == "O" && btn[4].getText() == "O" && btn[6].getText() == "O")){
            JOptionPane.showMessageDialog(null, "O Ganhou!");
            PO++;
            atualizar();
            limpar();
        }else if(cont == 9){
            JOptionPane.showMessageDialog(null, "Velha!");
            limpar();     
        }
    }
    
    public void limpar(){
        for (int i = 0; i < 9; i++){
            btn[i].setText("");
            click[i] = false;            
        }
    }
    
    public static void main(String[] args) {
        new JogoDaVelha();
    }
    
}
