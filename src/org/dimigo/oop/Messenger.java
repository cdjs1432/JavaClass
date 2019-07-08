package org.dimigo.oop;

public class Messenger {

    /**
     * Default constructor
     */
    public Messenger() {
    }

    private int friends;
    private String themes;
    private int sound;
    private String font;
    private int version;

    public void makeRoom(int number) {
        System.out.println(number + "명의 톡방이 만들어졌습니다.");
    }

    public void addFriend(String friend) {
        System.out.println(friend + "친구가 추가되었습니다.");
    }

    public void chat(String message) {
        System.out.println(message + "가 전달되었습니다.");
    }

    public void groupCall() {
        System.out.println("그룹콜을 겁니다...");
    }

    public void deleteFriend(String friend) {
        System.out.println(friend + "친구가 목록에서 삭제되었습니다.");
    }

}