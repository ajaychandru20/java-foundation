package com.lao.basicJavaLearnings.TypesOfStrings;

public class StringBuilderMethods {
    public static void main(String[] args) {
        // Initial StringBuilder
        StringBuilder sb = new StringBuilder("Hello World!");
        System.out.println("Original StringBuilder: \"" + sb + "\"");

        // charAt(int index)
        System.out.println("Character at index 6: " + sb.charAt(6));

        // append(String str)
        sb.append(" Java");
        System.out.println("After append: \"" + sb + "\"");

        // insert(int offset, String str)
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: \"" + sb + "\"");

        // replace(int start, int end, String str)
        sb.replace(6, 15, "Amazing");
        System.out.println("After replace: \"" + sb + "\"");

        // delete(int start, int end)
        sb.delete(6, 13);
        System.out.println("After delete: \"" + sb + "\"");

        // reverse()
        sb.reverse();
        System.out.println("After reverse: \"" + sb + "\"");

        // length()
        System.out.println("Length of StringBuilder: " + sb.length());

        // substring(int start, int end)
        String substring = sb.substring(0, 5);
        System.out.println("Substring (0, 5): \"" + substring + "\"");

        // setCharAt(int index, char ch)
        sb.setCharAt(0, 'W');
        System.out.println("After setCharAt: \"" + sb + "\"");

        // ensureCapacity(int minimumCapacity)
        sb.ensureCapacity(50);
        System.out.println("Capacity ensured to 50. Current capacity: " + sb.capacity());

        // deleteCharAt(int index)
        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt: \"" + sb + "\"");
    }
}
