// Árvore_Binária.java
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class Árvore_Binária {
    Node root;

    public Árvore_Binária() {
        root = null;
    }

    // Método para inserir um novo nó
    public void insert(int key) {
        root = insertRec(root, key);
    }

    // Função recursiva auxiliar para inserção
    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    // Método para remover um nó
    public void delete(int key) {
        root = deleteRec(root, key);
    }

    // Função recursiva auxiliar para remoção
    private Node deleteRec(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    private int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    // Percurso Pré-Ordem
    public List<Integer> getPreOrderTraversal() {
        List<Integer> result = new ArrayList<>();
        preOrderRec(root, result);
        return result;
    }

    private void preOrderRec(Node root, List<Integer> result) {
        if (root != null) {
            result.add(root.key);
            preOrderRec(root.left, result);
            preOrderRec(root.right, result);
        }
    }

    // Percurso In-Ordem
    public List<Integer> getInOrderTraversal() {
        List<Integer> result = new ArrayList<>();
        inOrderRec(root, result);
        return result;
    }

    private void inOrderRec(Node root, List<Integer> result) {
        if (root != null) {
            inOrderRec(root.left, result);
            result.add(root.key);
            inOrderRec(root.right, result);
        }
    }

    // Percurso Pós-Ordem
    public List<Integer> getPostOrderTraversal() {
        List<Integer> result = new ArrayList<>();
        postOrderRec(root, result);
        return result;
    }

    private void postOrderRec(Node root, List<Integer> result) {
        if (root != null) {
            postOrderRec(root.left, result);
            postOrderRec(root.right, result);
            result.add(root.key);
        }
    }

    // Percurso Em Nível
    public List<Integer> getLevelOrderTraversal() {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            result.add(tempNode.key);
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
        return result;
    }

    // NOVO: Método utilitário para formatar a lista como String
    public static String formatListToString(String label, List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(label).append(": ");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(i == list.size() - 1 ? "" : ", ");
        }
        sb.append("\n"); // Adiciona nova linha para melhor formatação em JOptionPane
        return sb.toString();
    }
}