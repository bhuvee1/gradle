package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000",maxAge = 3600)
@RestController
public class BookController {
        final
        BookRepository bookRepository;

        public BookController(BookRepository bookRepository) {
            this.bookRepository = bookRepository;
        }

        @GetMapping("/books")
        public List<Book> getAllBook(){
            return bookRepository.findAll();
        }

        @GetMapping("/books/{id}")
        public Optional<Book> getAllBookById(@PathVariable(value="id")Integer id)
        {
            return bookRepository.findById(id);
        }

        @PostMapping("/books")
        public @Valid Book CreateBook(@Valid @RequestBody Book book)
        {
            return bookRepository.save(book);
        }


        @PutMapping("/books/{id}")
        public @Valid Book updateBookById(@PathVariable(value="id")Integer id, @Valid @RequestBody Book book) throws BookNotFoundException {
            Book b1 = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
            b1.setName(book.getName());
            Book updbook=bookRepository.save(b1);
            return updbook;

        }

        @DeleteMapping("/books/{id}")
        public ResponseEntity<?> deleteBook(@PathVariable(value = "id") int Id) throws BookNotFoundException {
            Book b2 = bookRepository.findById(Id)
                    .orElseThrow(() -> new BookNotFoundException(Id));

            bookRepository.delete(b2);
            System.out.println("i love java jenkin");

            return ResponseEntity.ok().build();
        }
    }




