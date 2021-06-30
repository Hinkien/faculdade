package dns;
import java.util.List;
import java.util.ArrayList;
 
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
}

class MyTree {
 
    public static void main(String[] args) {
        Node root = createTree();
        printTree(root, " ");  
        
        String fqdn = "www.pucpr.br";
        Node no = findip(root, fqdn);

        System.out.println(fqdn + " host:" + no.data + "=" + no.ip);
        
        fqdn = "www.ppgia.pucpr.br";
        no = findip(root, fqdn);

        System.out.println(fqdn + " host:" + no.data + "=" + no.ip);
        
        fqdn = "www.ufpr.br";
        no = findip(root, fqdn);

        System.out.println(fqdn + " host:" + no.data + "=" + no.ip);
        
        fqdn = "ppgia.pucpr.br";
        no = findip(root, fqdn);
        no.addChild(new Node("zeus", "8.8.8.8"));
        
        printTree(root, " ");  

        fqdn = "zeus.ppgia.pucpr.br";
        no = findip(root, fqdn);

        System.out.println(fqdn + " host:" + no.data + "=" + no.ip);
        
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
        for (int i=domain.length-1; i >=0; --i) {
            for( Node n: atual.children ) {
                    System.out.println("caminhando por: " + n.data);
                    if (n.data.equals(domain[i])) {
                        atual = n;
                        break;
                    } 
            }
        }

        return atual;
    }  
}
