package exercicios;

class MyTree {
	 
    public static void main(String[] args) {
        Node root = createTree();
        printTree(root, " ");     

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
}