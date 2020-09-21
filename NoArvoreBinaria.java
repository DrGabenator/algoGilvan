public class NoArvoreBinaria <T>{
    private T info;
    private NoArvoreBinaria<T> direita;
    private NoArvoreBinaria<T> esquerda;
    
    public NoArvoreBinaria(T info){
        this.setInfo(info);
    }
    
    public NoArvoreBinaria(T info, NoArvoreBinaria<T> dir, NoArvoreBinaria<T> esq){
        this.setInfo(info);
        this.setDireita(dir);
        this.setEsquerda(esq);
    }
    
    public T getInfo(){
        return info;
    }
    
    public void setInfo(T info){
        this.info = info;
    }
    
    public NoArvoreBinaria<T> getDireita(){
        return direita;
    }
    
    public void setDireita(NoArvoreBinaria<T> direita){
        this.direita = direita;
    }
    
    public NoArvoreBinaria<T> getEsquerda(){
        return esquerda;
    }
    
    public void setEsquerda(NoArvoreBinaria<T> esquerda){
        this.esquerda = esquerda;
    }
}
