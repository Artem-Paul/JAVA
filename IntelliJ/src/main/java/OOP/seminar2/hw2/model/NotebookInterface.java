package OOP.seminar2.hw2.model;

public interface NotebookInterface {
    Notebook getNotebook(String os, String brand, String model, String cpu, Integer ram, Integer ssd, Integer price)
            throws IllegalStateException;
}
