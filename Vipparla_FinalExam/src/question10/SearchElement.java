/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class SearchElement {

    private ArrayList<Integer> list1;
    private static int i = 0;

    public SearchElement(ArrayList<Integer> list1) {
        this.list1 = list1;
    }

    public int search(int n) {
        if (list1.size() < i + 1) {
            
            throw new NoSuchElementException(n + " Element is not available in the list");
            
        }

        if (list1.get(i) == n) {
            return i;
        } else {
            i = i + 1;
            return search(n);
        }

    }

}
