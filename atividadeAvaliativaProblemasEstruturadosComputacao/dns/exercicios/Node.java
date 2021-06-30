package exercicios;

import java.util.ArrayList;
import java.util.List;
 
class Node {
 
    Node parent = null;
    String data;
    String ip;
    List<Node> children = new ArrayList<>();
        
    public Node(String data, String ip) {
        this.data = data;
        this.ip = ip;
    }
    
    public Node addChild(Node child) {
        child.parent = this;
        this.children.add(child);
        return child;
    }
    
    public void addChildren(List<Node> children) {
        children.forEach(each -> each.parent = this);
        this.children.addAll(children);
    }

 //class MyTree {
	 
    public static void main(String[] args) {
        Node root = createTree();
        printTree(root, " ");
        Node no =findip (root, "www.pucpr.br");
        System.out.println(no.data + "=" + no.ip); //verificar pr�xima aula

    }
    
    static Node createTree() {
        Node root = new Node("root", "dominio");
        
        Node br = root.addChild(new Node("br", "dominio"));
        
        Node pucpr = br.addChild(new Node("pucpr", "dominio"));
        pucpr.addChild(new Node("www", "1.2.3.4"));
        pucpr.addChild(new Node("ava", "1.2.3.5"));
        Node ppgia = pucpr.addChild(new Node("ppgia", "dominio"));
        ppgia.addChild(new Node("www", "1.2.3.6"));
        Node ufpr = br.addChild(new Node("ufpr", "dominio"));
        ufpr. addChild(new Node("www", "4.3.2.1"));
        return root;
    }
  
    static void printTree(Node node, String pai) {
      System.out.println(pai + node.data + " = " + node.ip);
      node.children.forEach(each ->  printTree(each, pai + pai));
    }
    
    static Node findip( Node root, String fqdn) {
        Node atual = root;
        String[] domain = fqdn.split("\\.");
	// fa�a um for para testar os dom�nios da dire�ao do root at� a folha
        for(int i=domain.length-1; i <=0; --i)
	     // fa�a um for para varrer os filhos do n� atual at� achar o dom�nio testado
        	for (Node n: atual.children) {
                System.out.println("caminhando por: " + n.data);
                if (n.data.equals(domain[i])) {
                    atual = n;
                    break;
                } 
        	}
        return atual;
    }
}
