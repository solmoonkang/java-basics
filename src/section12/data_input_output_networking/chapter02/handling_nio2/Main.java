package section12.data_input_output_networking.chapter02.handling_nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static final String CUR_PATH =
            "src/section12/data_input_output_networking/chapter02/handling_nio2/";

    public static void main(String[] args) {

        //  💡 프로젝트 폴더 경로
        Path path1 = Paths.get("");
        Path path1Abs = path1.toAbsolutePath();

        Path path2 = Paths.get("my_file.txt");
        Path path2Abs = path2.toAbsolutePath();

        //  💡 인자로 들어온 문자열을 각각 내부 폴더로
        Path path3 = Paths.get(CUR_PATH, "sub1", "sub2", "sub3");

        //  💡 두 경로를 통합
        Path path4 = path3.resolve(path2);

        //  💡 부모 경로
        Path path5 = path4.getParent();

        //  💡 한 경로에서 다른 경로로의 상대 경로
        Path path6 = path4.relativize(path2);

        //  💡 끝단 파일/폴더명
        Path path7 = path4.getFileName();

        //  💡 서브경로
        Path path8 = path4.subpath(3, 5);
    }
}
