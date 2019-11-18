package org.example.controller;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class MyController {
    private static int count = 0;

//    @Autowired
//    private BookService bookService;

    public void go() {
        final Display display = new Display();
        final Shell shell = new Shell(display);
        final Label label = new Label(shell, SWT.NONE);
        label.setText("text");
        label.pack();
        shell.pack();
        shell.setSize(450,300);
        Button button = new Button(shell, SWT.NONE);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDown(MouseEvent e) {
                System.out.println(count++);
//                Book book = new Book("КНИГА"+count++, 120.0+count);
//                bookService.addBook();
            }
        });
        button.setBounds(150,110, 150, 30);
        button.setText("BTN");

        shell.open();
        while (!shell.isDisposed()){
            if(!display.readAndDispatch()){
                display.sleep();
            }
        }
    }
}
