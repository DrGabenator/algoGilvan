/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julia
 */
public class ListaEstatica <T>{
    private T[] info;
    private int tamanho;
    private final byte TAMANHO_INICIAL = 10;
    
    public ListaEstatica(){
        info = (T[]) new Object[TAMANHO_INICIAL];
        tamanho = 0;
    }
    
    private void redimencionar(){
        T[] novo = (T[]) new Object[tamanho + TAMANHO_INICIAL];
        for (int i=0;i<tamanho;i++){
            novo[i] = info[i];
        }
        info = novo;
    }
    
    public void inserir(T numero){
        if (tamanho == info.length){
            this.redimencionar();
        }
        info[tamanho] = numero;
        tamanho++;
    }
    
    public void exibir(){
        for (int i=0;i<tamanho;i++){
            System.out.println(info[i]);
        }
    }
    
    public int buscar(T valor){
        for (int i=0;i<tamanho;i++){
            if (info[i].equals(valor)){
                return i;
            }
        }
        return -1;
    }
    
    public void retirar(T valor){
        int posicao = buscar(valor);
        if (posicao > -1){
            for (int i=posicao;i<tamanho-1;i++){
                info[i] = info[i+1];
            }
            tamanho--;
            info[tamanho] = null;
            }
    }
    
    public void liberar(){
        info = (T[]) new Object[TAMANHO_INICIAL];
        tamanho = 0;
    }
    
    public T obterElemento(int posicao){
        if (posicao >= tamanho
                || posicao < 0){
            throw new IndexOutOfBoundsException("posição inexistente ou não ocupada");
        }
        return info[posicao];
    }
    
    public boolean estaVazia(){
        return tamanho==0;
    }
    
    public int getTamanho(){
        return tamanho;
    }
    
    @Override
    public String toString(){
        String str = "";
        for (int i=0;i<tamanho;i++){
            if (i > 0){
                str += ",";
            }
            str += info[i];
        }
        return str;
    }
}
