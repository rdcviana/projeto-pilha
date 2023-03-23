package one.digitalinovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public void push(No novoNo) {
        No refAuxilar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReferenciaNo(refAuxilar);
    }

    public No pop() {
        if (!isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getReferenciaNo();
            return noPoped;
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + ")]\n";
                noAuxiliar = noAuxiliar.getReferenciaNo();
            } else {
                break;
            }
        }
        stringRetorno += "============\n";
        return stringRetorno;
    }

}
