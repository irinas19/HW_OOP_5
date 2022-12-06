package personal.model;

import java.util.List;

public interface OperationFile {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}