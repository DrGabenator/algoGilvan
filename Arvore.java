public class Arvore <T>{
    private NoArvore<T> raiz;
    
    public Arvore(){
        raiz = null;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }
    
    public boolean perterce(T info){
        if (raiz == null){
            return false;
        }
        return pertence(raiz, info);
    }
    
    private boolean pertence(NoArvore<T> no, T info){
        if (no.getInfo().equals(info)){
            return true;
        } else {
          NoArvore <T> p;
          p = no.getPrimeiro();
          while (p != null){
              if (pertence(p,info)){
                  return true;
              }
              p = p.getProximo();
            }
            return false;
        }
    }
    
    @Override
    public String toString(){
        if (raiz == null){
            return "";
        } else {
            return obterRepresentacaoTextual(raiz);
        }
    }
    
    private String obterRepresentacaoTextual(NoArvore<T> no){
        NoArvore<T> p;
        
        String s = "<";
        s += no.getInfo();
        
        p = no.getPrimeiro();
        while (p != null){
            s += obterRepresentacaoTextual(p);
            p = p.getProximo();
        }
        
        s += ">";
        
        return s;
    }
    
    public NoArvore<T> buscar(T info){
        if (getRaiz() == null){
            return null;
        } else {
            return buscar(getRaiz(), info);
        }
    }
    
    private NoArvore<T> buscar(NoArvore<T> no, T info){
        if (no.getInfo().equals(info)){
            return no;
        } else {
            NoArvore<T> p = no.getPrimeiro();
            while (p != null){
                NoArvore<T> noLocalizado = buscar(p, info);
                if (noLocalizado != null){
                    return noLocalizado;
                } else {
                    p = p.getProximo();
                }
            }
        }
        return null;
    }
    
    public int contarNos(){
        if (raiz == null){
            return 0;
        } else {
            return contarNos(getRaiz());
        }
    }
    
    private int contarNos(NoArvore<T> no){
        int qtde = 1;
        
        NoArvore<T> p = no.getPrimeiro();
        while (p != null){
            qtde += contarNos(p);
            p = p.getProximo();
        }
        return qtde;
    }
}