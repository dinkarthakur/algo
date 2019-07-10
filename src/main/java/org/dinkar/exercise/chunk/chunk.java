package org.dinkar.exercise.chunk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class chunk {

    public void chunked(int[] arr, int chunkSize) {
        int[] chunk = new int[chunkSize];
        int chunkCount = (arr.length +1)/2;
        int[][] chunkList = new int[chunkCount][chunkSize];
        int index = 0;
        int cnkIndex = 0;
        for(int i=0; i < arr.length; i++) {
            if(index < chunkSize) {
                chunk[index] = arr[i];
                index++;
            }
            if(index == chunkSize) {
                chunkList[cnkIndex] = chunk;
                chunk = new int[chunkSize];
                cnkIndex++;
                index = 0;
            }
        }
        if(chunk.length > 0) {
            chunkList[cnkIndex] = chunk;
        }
        System.out.println(Arrays.deepToString(chunkList));
    }


//    public void chunked(int[] arr, int chunkSize) {
//        List<Integer> chunk = new ArrayList();
//        List<List<Integer>> chunkList = new ArrayList<>();
//        for(int i=0; i < arr.length; i++) {
//            if(chunk.size() < chunkSize) {
//                chunk.add(arr[i]);
//            } else {
//                chunkList.add(chunk);
//                chunk = new ArrayList();
//                chunk.add(arr[i]);
//            }
//        }
//        if(chunk.size() > 0) {
//            chunkList.add(chunk);
//        }
//
//        System.out.println(Arrays.deepToString(chunkList.toArray()));
//    }
}
