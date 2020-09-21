public class ListaEncadeada <T>{
    private NoLista primeiro;
    
    public ListaEncadeada(){
        primeiro = null;
    }
    
    public NoLista<T> getPrimeiro(){
        return primeiro;
    }
    
    public void inserir(T info){
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(info);
        novo.setProximo(primeiro);
        primeiro = novo;
    }
    
    public boolean estaVazia(){
        return primeiro == null;
    }
    
    public NoLista<T> buscar(T v){
       NoLista<T> p = primeiro;
       while (p != null){
           if (p.getInfo().equals(v)){
               return p;
           }
           p = p.getProximo();
       }
       return null;
    }
    
    public void retirar(T v){
       NoLista<T> anterior = null; 
       NoLista<T> p = primeiro;
       while ((p != null)
               && (!p.getInfo().equals(v))){
           anterior = p;
           p = p.getProximo();
       }
       if (p != null){
           if (anterior == null){
               primeiro = p.getProximo();
           } else {
               anterior.setProximo(p.getProximo());
           }
       }
    }
    
    public int obterComprimento(){
        int comprimento = 0;
        NoLista<T> p = primeiro;
        while (p != null){
            comprimento ++;
            p = p.getProximo();
        }
        return comprimento;
    }
    
    public NoLista<T> obterNo(int idx){
        NoLista<T> p = primeiro;
        for (int i=0; i<idx && p != null; i++){
            p = p.getProximo();
        }
        if (idx < 0
                || p == null){
            throw new IndexOutOfBoundsException("Indice negativo ou grande demais");
        } else {
            return p;
        }
    }
    
    @Override
    public String toString(){
        String str = "";
        NoLista<T> p = primeiro;
        while (p != null){
            if (p != primeiro){
                str += ",";
            }
            str += p.getInfo().toString();
            p = p.getProximo();
        }
        return str;
    }
}
