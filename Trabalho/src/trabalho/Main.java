/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;



/**
 *
 * @author 00210402
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "", "Seja Bem vindo ao Duelo de Pokemon. ", JOptionPane.INFORMATION_MESSAGE, new ImageIcon ("C:\\Trabalho\\img\\jogador1.png"));
       

        
        ArrayList<Pokemon> pokemonsList = new ArrayList();
        Random gerador = new Random();
        pokemonsList.add(new Pokemon("Charmander",gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1 ));
        pokemonsList.add(new Pokemon("Charizard",gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1 ));
        pokemonsList.add(new Pokemon("Pikachu",gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1 ));
        pokemonsList.add(new Pokemon("Blastoise",gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1 ));
        pokemonsList.add(new Pokemon("Bulbasaur",gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1 ));
        pokemonsList.add(new Pokemon("Hitmonlee",gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1 ));
        pokemonsList.add(new Pokemon("Onix",gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1,gerador.nextInt(100)+1));
       
        
        int pokemon1,pokemon2;
        Pokemon buscaPokemon = new Pokemon();
        Jogador nome1 = new Jogador();
        Jogador nome2 = new Jogador();
        int atributo = 0;
        
        
        String resultado = null;
        
        UIManager.put("OptionPane.noButtonText", "Player X Bot"); 
        UIManager.put("OptionPane.yesButtonText", "Player x Player");
       int opcao =  JOptionPane.showConfirmDialog(null, "Escolha um tipo de Duelo","Modo de combate",JOptionPane.YES_NO_OPTION);
        //Pokemon.createPokemonList();
       
        if (opcao == JOptionPane.YES_OPTION ){
        nome1.setNome(JOptionPane.showInputDialog("O nome do primeiro jogador " ));
        nome2.setNome(JOptionPane.showInputDialog("O nome do segundo jogador " )); 
        pokemon1= Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 | Existe 7 pokemons, informe um número de 0 a 6 de um pokemon para escolher: "));
        pokemon2= Integer.parseInt(JOptionPane.showInputDialog("Jogador 2 | Existe 7 pokemons, informe um número de 0 a 6 de um pokemon para escolher: "));              

        }else {
        nome1.setNome(JOptionPane.showInputDialog("O nome do primeiro jogador " ));
        nome2.setNome("BOT"); 
        pokemon1= Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 | Existe 7 pokemons, informe um número de 0 a 6 de um pokemon para escolher:"));
        pokemon2= gerador.nextInt(pokemonsList.size());    
        
        
        }
       
        nome1.setPokemon(pokemonsList.get(pokemon1)); 
        nome2.setPokemon(pokemonsList.get(pokemon2));
        
         
        atributo = Integer.parseInt(JOptionPane.showInputDialog("Escolha um atributo: \n "
                + "1 para Ataque ou \n"
                + "2 para Defesa ou \n"
                + "3 para velocidade ou \n"
                + "4 para destreza ou \n"
                + "5 para poder De Habilidade ou \n"
                + "6 para poder De Defesa"));
        
//        
        if (atributo == 1) {
            if (nome1.getPokemon().getAtaque() > nome2.getPokemon().getAtaque()) {
                resultado = "Ganhador: " + nome1.getNome()+" | "+" Ataque: "+nome1.getPokemon().getAtaque()+" | "+" Nome Pokemon: " + nome1.getPokemon().getNomePokemon()+"\n"
                + "Perdedor: " + nome2.getNome()+" | "+"Ataque: "+nome2.getPokemon().getAtaque()+" | "
                + " Nome Pokemon: " + nome2.getPokemon().getNomePokemon();
            }else if (nome1.getPokemon().getAtaque() < nome2.getPokemon().getAtaque()) {
                resultado = "Ganhador: " + nome2.getNome()+" | "+" Ataque: "+nome2.getPokemon().getAtaque()+" | "+" Nome Pokemon: " + nome2.getPokemon().getNomePokemon()+"\n"
                + "Perdedor: " + nome1.getNome()+" | "+"Ataque: "+nome1.getPokemon().getAtaque()+" | "
                + " Nome Pokemon: " + nome1.getPokemon().getNomePokemon();
            }else{
                resultado = "empate"+" | "+ nome1.getNome()+" | "+nome2.getNome();
            }
            
            
            
        }else if (atributo == 2) {
            if (nome1.getPokemon().getDefesa()> nome2.getPokemon().getDefesa()) {
                resultado = "Ganhador: " + nome1.getNome()+" | "+" Defesa: "+nome1.getPokemon().getDefesa()+" | "+" Nome Pokemon: " + nome1.getPokemon().getNomePokemon()+"\n"
                + "Perdedor: " + nome2.getNome()+" | "+" Defesa: "+nome2.getPokemon().getDefesa()+" | "
                + " Nome Pokemon: " + nome2.getPokemon().getNomePokemon();
                      
            }else if (nome1.getPokemon().getDefesa()< nome2.getPokemon().getDefesa()) {
                resultado = "Ganhador: " + nome2.getNome()+" | "+" Defesa: "+nome2.getPokemon().getDefesa()+" | "+" Nome Pokemon: " + nome2.getPokemon().getNomePokemon()+"\n"
                + "Perdedor: " + nome1.getNome()+" | "+" Defesa: "+nome1.getPokemon().getDefesa()+" | "
                + " Nome Pokemon: " + nome1.getPokemon().getNomePokemon();
        }else{
                resultado = "empate"+" | "+ nome1.getNome()+" | "+nome2.getNome();
            }
            
            
            
        }else if (atributo == 3) {
            if (nome1.getPokemon().getVelocidade()> nome2.getPokemon().getVelocidade()) {
               resultado = "Ganhador: " + nome1.getNome()+" | "+"Velocidade: "+nome1.getPokemon().getVelocidade()+" | "+" Nome Pokemon: " + nome1.getPokemon().getNomePokemon()+"\n"
               + "Perdedor: " + nome2.getNome()+" | "+"Velocidade: "+nome2.getPokemon().getVelocidade()+" | "
               + " Nome Pokemon: " + nome2.getPokemon().getNomePokemon();        
            }else if (nome1.getPokemon().getVelocidade()< nome2.getPokemon().getVelocidade()) {
               resultado = "Ganhador: " + nome2.getNome()+" | "+"Velocidade: "+nome2.getPokemon().getVelocidade()+" | "+" Nome Pokemon: " + nome2.getPokemon().getNomePokemon()+"\n"
               + "Perdedor: " + nome1.getNome()+" | "+"Velocidade: "+nome1.getPokemon().getVelocidade()+" | "
               + " Nome Pokemon: " + nome1.getPokemon().getNomePokemon();
            }else{
               resultado = "empate"+" | "+ nome1.getNome()+" | "+nome2.getNome();
            }
            
            
            
        }else if (atributo == 4) {
            if (nome1.getPokemon().getDestreza()> nome2.getPokemon().getDestreza()) {
               resultado = "Ganhador: " + nome1.getNome()+" | "+"Destreza: "+nome1.getPokemon().getDestreza()+" | "+" Nome Pokemon: " + nome1.getPokemon().getNomePokemon()+"\n"
               + "Perdedor: " + nome2.getNome()+" | "+"Destreza: "+nome2.getPokemon().getDestreza()+" | "
               + " Nome Pokemon: " + nome2.getPokemon().getNomePokemon();       
            }else if (nome1.getPokemon().getDestreza()< nome2.getPokemon().getDestreza()) {
                resultado = "Ganhador: " + nome2.getNome()+" | "+"Destreza: "+nome2.getPokemon().getDestreza()+" | "+" Nome Pokemon: " + nome2.getPokemon().getNomePokemon()+"\n"
               + "Perdedor: " + nome1.getNome()+" | "+"Destreza: "+nome1.getPokemon().getDestreza()+" | "
               + " Nome Pokemon: " + nome1.getPokemon().getNomePokemon();
            }else{
               resultado = "empate"+" | "+ nome1.getNome()+" | "+nome2.getNome();
            }
            
            
            
            
        }else if (atributo == 5) {
            if (nome1.getPokemon().getPoderDeHabilidade()> nome2.getPokemon().getPoderDeHabilidade()) {
               resultado = "Ganhador: " + nome1.getNome()+" | "+"Poder de Habilidade: "+nome1.getPokemon().getPoderDeHabilidade()+" | "+" Nome Pokemon: " + nome1.getPokemon().getNomePokemon()+"\n"
               + "Perdedor: " + nome2.getNome()+" | "+"Poder de Habilidade: "+nome2.getPokemon().getPoderDeHabilidade()+" | "
               + " Nome Pokemon: " + nome2.getPokemon().getNomePokemon();      
            }else if (nome1.getPokemon().getPoderDeHabilidade()< nome2.getPokemon().getPoderDeHabilidade()) {
               resultado = "Ganhador: " + nome2.getNome()+" | "+"Poder de Habilidade: "+nome2.getPokemon().getPoderDeHabilidade()+" | "+" Nome Pokemon: " + nome2.getPokemon().getNomePokemon()+"\n"
               + "Perdedor: " + nome1.getNome()+" | "+"Poder de Habilidade: "+nome1.getPokemon().getPoderDeHabilidade()+" | "
               + " Nome Pokemon: " + nome1.getPokemon().getNomePokemon();
            }else{
               resultado = "empate"+" | "+ nome1.getNome()+" | "+nome2.getNome();
            }
            
            
            
            
        }else if (atributo == 6) {
            if (nome1.getPokemon().getPoderDeDefesa()> nome2.getPokemon().getPoderDeDefesa()) {
               resultado = "Ganhador: " + nome1.getNome()+" | "+"Poder de Defesa: "+nome1.getPokemon().getPoderDeDefesa()+" | "+" Nome Pokemon: " + nome1.getPokemon().getNomePokemon()+"\n"
               + "Perdedor: " + nome2.getNome()+" | "+"Poder de Defesa: "+nome2.getPokemon().getPoderDeDefesa()+" | "
               + " Nome Pokemon: " + nome2.getPokemon().getNomePokemon();    
            }else if (nome1.getPokemon().getPoderDeDefesa()< nome2.getPokemon().getPoderDeDefesa()) {
               resultado = "Ganhador: " + nome2.getNome()+" | "+"Poder de Defesa: "+nome2.getPokemon().getPoderDeDefesa()+" | "+" Nome Pokemon: " + nome2.getPokemon().getNomePokemon()+"\n"
               + "Perdedor: " + nome1.getNome()+" | "+"Poder de Defesa: "+nome1.getPokemon().getPoderDeDefesa()+" | "
               + " Nome Pokemon: " + nome1.getPokemon().getNomePokemon();
            }else{
               resultado = "empate"+" | "+ nome1.getNome()+" | "+nome2.getNome();
            
            }
            
            
            
        }else {
                resultado = "Atributo Inválido ";
                }
        JOptionPane.showMessageDialog(null, "", "QUE COMEÇE A BATALHA ", JOptionPane.INFORMATION_MESSAGE, new ImageIcon ("C:\\Trabalho\\img\\DUELO.png"));
        
         JOptionPane.showMessageDialog(null, resultado, "Duelo de Pokemon", JOptionPane.INFORMATION_MESSAGE, new ImageIcon ("C:\\Trabalho\\img\\pokebola.png"));


       
        

    }

   
}
         
    

