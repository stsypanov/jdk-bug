package tsypanov.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = Main.class
                .getClassLoader()
                .getResource("tsypanov/example/war-and-peace.json")
                .getPath();
        List<String> lines = Files.readAllLines(Path.of(path));
        assert lines.size() == 1;
    }
}
