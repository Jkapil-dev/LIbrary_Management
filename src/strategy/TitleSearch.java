package strategy;

import model.Book;

import java.util.List;

class TitleSearch implements SearchStrategy {


    @Override
    public List<Book> search(List<Book> books, String keyword) {
        return List.of();
    }
}
