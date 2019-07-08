package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BasicException {
    public static void main(String[] args) {
        try {
            uncheckedException(null);
            checkedException();
            String id = null;
            validate(id);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void validate(String id) throws Exception{
        try {
            if (id == null || "".equals(id)) {
                // 예외 발생
                Exception e = new Exception("ID를 입력하세요.");
                throw e;
            }
            if (id.length() < 8) {
                throw new Exception("8자리 이상 입력하세요");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
    private static void uncheckedException(String s) {
        try {
            System.out.println(s.length());
            System.out.println(Integer.parseInt("123a"));
        } catch (NullPointerException npe) {
            // NullPointerException npe = new NullPointerException();
            System.out.println("문자열이 없습니다. 문자열을 입력하세요.");
            npe.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.out.println("숫자만 입력해주세요.");
            nfe.printStackTrace();
        } catch (Exception e) {
            System.out.println("알 수 없는 오류입니다.");
        }

    }

    private static void checkedException() {
        try{
            BufferedReader br = new BufferedReader(
                    new FileReader("input.txt")
            );
            String str;
            while ((str = br.readLine() ) != null) {
                System.out.println(str);
            }
        } catch(FileNotFoundException fne) {
            System.out.println("파일이 없습니다.");
        } catch (IOException ioe) {
            System.out.println("파일이 없다니까요?");
        }
    }
}
