package OOP.seminar2.cw1old.model;

public interface NotebookInterface {
    Notebook getNotebook(String os, String brand, String model, String cpu, Integer ram, Integer ssd, Integer price)
            throws IllegalStateException;
}
