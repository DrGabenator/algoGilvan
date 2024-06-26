/**
 *
 * @author gabrielsantos
 */
public class ListaDupla <T>{
    private NoListaDupla<T> primeiro;
    
    public ListaDupla(){
        primeiro = null;
    }
    
    public NoListaDupla<T> getPrimeiro(){
        return primeiro;
    }
    
    public void inserir(T info){
        NoListaDupla<T> novo = new NoListaDupla<>();
        novo.setInfo(info);
        novo.setProximo(primeiro);
        novo.setAnterior(null);
        if (primeiro != null)
            primeiro.setAnterior(novo);
        primeiro = novo;
    }
    
    public NoListaDupla<T> buscar(T valor){
        NoListaDupla<T> p = primeiro;
        
        while (p != null){
            if (p.getInfo().equals(valor))
                return p;
            p = p.getProximo();
        }
        return null;
    }
    
    public void retirar(T valor){
        NoListaDupla<T> p = buscar(valor);
        
        if (p != null){
            if (primeiro == p)
                primeiro = p.getProximo();
        } else
            p.getAnterior().setProximo(p.getProximo());
        
        if (p.getProximo() != null){
            p.getProximo().setAnterior(p.getAnterior());
        }
    }
    
    private NoListaDupla<T> obterUltimo(){
        NoListaDupla<T> ultimo = primeiro;
        
        NoListaDupla<T> p = primeiro;
        while (p != null){
            ultimo = p;
            p = p.getProximo();
        }
        return ultimo;
    }
    
    public void exibirOrdemInversa() {
        NoListaDupla<T> p = obterUltimo();
        
        while (p != null){
            System.out.println(p.getInfo());
            p = p.getAnterior();
        }
    }
    
    public void liberar(){
        NoListaDupla <T> p = primeiro;
        NoListaDupla <T> proximo = null;
        while (p != null){
            proximo = p.getProximo();
            proximo.setAnterior(null);
            proximo.setProximo(null);
            p = proximo;
        }
        primeiro = null;
    }
    
    @Override
    public String toString(){
        String resultado = "";
        NoListaDupla<T> p = primeiro;
        
        while (p != null){
            if (p != primeiro){
                resultado += ",";
            }
            
            resultado += p.getInfo().toString();
            p = p.getProximo();
        }
        return resultado;
    }
    
    public int obterUltimaPosicao(T valor){
        NoListaDupla<T> ultima = primeiro;
        
        NoListaDupla<T> p = primeiro;
        
        while(p != null){
            ultima = p;
            p = p.getProximo();
            if(p.getProximo() == null){
                valor = (T) p.getAnterior();
            }
            else{
                valor = -1;
                return valor;
            }
        }
        return valor;
    }
}
