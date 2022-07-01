/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

import java.util.ArrayList;

import java.util.Random;
/**
 *
 * @author 00210402
 */

public  class Pokemon {
    
        //public static ArrayList<Pokemon> pokemonsList = new ArrayList();
        private String nomePokemon;
        private int ataque ;
        private int defesa ;
        private int velocidade;
        private int destreza ;
        private int poderDeHabilidade;
        private int poderDeDefesa;
        
    public Pokemon() {
    }

    public Pokemon(String nomePokemon, int ataque, int defesa, int velocidade, int destreza, int poderDeHabilidade, int poderDeDefesa) {
        this.nomePokemon = nomePokemon;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.destreza = destreza;
        this.poderDeHabilidade = poderDeHabilidade;
        this.poderDeDefesa = poderDeDefesa;
    }

    public String getNomePokemon() {
        return nomePokemon;
    }

    public void setNomePokemon(String nomePokemon) {
        this.nomePokemon = nomePokemon;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getPoderDeHabilidade() {
        return poderDeHabilidade;
    }

    public void setPoderDeHabilidade(int poderDeHabilidade) {
        this.poderDeHabilidade = poderDeHabilidade;
    }

    public int getPoderDeDefesa() {
        return poderDeDefesa;
    }

    public void setPoderDeDefesa(int poderDeDefesa) {
        this.poderDeDefesa = poderDeDefesa;
    }
    
 
        
   
    
    

//        public Pokemon retornaPokemon (int idPokemon){
//            return pokemonsList.get(idPokemon);
//        }

    @Override
    public String toString() {
        return "Pokemon{" + "nomePokemon=" + nomePokemon + ", ataque=" + ataque + ", defesa=" + defesa + ", velocidade=" + velocidade + ", destreza=" + destreza + ", poderDeHabilidade=" + poderDeHabilidade + ", poderDeDefesa=" + poderDeDefesa + '}';
    }
      
       
}



