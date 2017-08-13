/* Copyright 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.engedu.touringmusician;


import android.graphics.Point;

import java.util.Iterator;

public class CircularLinkedListimplements Iterable<Point> {

private class Node {
    Point point;
    Node prev, next;
    Node(Point p) {
        point = p;
    }
};

    Node head;

    public void insertBeginning(Point p) {
        Node newNode = new Node(p);
        if (head == null){
            newNode.next=newNode;
            newNode.prev=newNode;
            head=newNode;
        }
        else{
            newNode.next= head;
            newNode.prev= head.prev;
            head.prev.next= newNode;
            head.prev= newNode;

        }

    }

    private float distanceBetween(Point from, Point to) {
        return (float) Math.sqrt(Math.pow(from.y-to.y, 2) + Math.pow(from.x-to.x, 2));
    }

    public float totalDistance() {
        float total = 0;
        Node currentCity = head;
        while (currentCity.next!= currentCity) {
            total = total + distanceBetween(currentCity.point, currentCity.next.point);
            currentCity = currentCity.next;
        }
        total = total + distanceBetween(currentCity.point, head.point);
        return total;
    }

    public void insertNearest(Point p) {
/**
 **
 **  YOUR CODE GOES HERE
 **
 **/
    }

    public void insertSmallest(Point p) {
/**
 **
 **  YOUR CODE GOES HERE
 **
 **/
    }

    public void reset() {
        head = null;
    }

private class CircularLinkedListIteratorimplements Iterator<Point> {

        Node current;

public CircularLinkedListIterator(){
        current=head;
        }
        }
@Override
public booleanhasNext() {
        return (current != null);
        }

@Override
public Point next() {
        Point toReturn = current.point;
        current = current.next;
        if (current == head) {
        current = null;
        }
        return toReturn;
        }

@Override
public void remove() {
        throw new UnsupportedOperationException();
        }
        }

@Override
public Iterator<Point> iterator() {
        return new CircularLinkedListIterator();
        }


        }

