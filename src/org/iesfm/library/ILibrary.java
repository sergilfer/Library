package org.iesfm.library;

public interface ILibrary {

    void showBooks();

    void showBooks(String genre);

    void showMembers();

    void showMembers(int cp);

    void showMemberLends(String nif);

    void showMemberLends(int numMember);

    // is has

    boolean memberHasLend(int numMember, int isbn);
}
