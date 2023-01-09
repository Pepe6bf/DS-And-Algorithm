package algorithm.recursive.hanoi.hanoi_simulation;

import java.util.*;

public class HanoiSimulation {

    Map<Character, List<Integer>> pillars = new HashMap<>();
    private final int PILLAR_COUNT = 3;

    public HanoiSimulation() {
        for (int i = 0; i < PILLAR_COUNT; i++) {
            pillars.put((char) (65 + i), new LinkedList<Integer>());
        }
    }

    public void simulation(int count, char startPillar, char endPillar, char tempPillar) {
        for (int i = count; i > 0; i--) {
            pillars.get(startPillar).add(i);
        }

        System.out.println("================== Hanoi Simulator ==================");
        printAllPillar();
        System.out.println("[System] : 기둥 초기화\n");
        System.out.println("[System] : Start!!\n");
        hanoi(count, startPillar, endPillar, tempPillar);
        System.out.println("\n[System] : 모든 원반 이동 완료\n");
        System.out.println("[System] : 시뮬레이터를 종료합니다.\n");
    }

    public void hanoi(int count, char from, char to, char temp) {
        if (count == 0) return;
        hanoi(count - 1, from, temp, to);
        moveDisk(count, from, to);
        printAllPillar();
        System.out.printf("[System] : 원반 %d를 %c에서 %c로 이동\n\n", count, from, to);
        hanoi(count - 1, temp, to, from);
    }

    private void moveDisk(int count, char from, char to) {
        // 원반 이동
        int size = pillars.get(from).size();
        pillars.get(to).add(pillars.get(from).get(size - 1));
        pillars.get(from).remove(size - 1);
    }

    private void printAllPillar() {
        for (int i = 0; i < PILLAR_COUNT; i++) {
            List<Integer> pillar = pillars.get((char) (65 + i));
            System.out.printf("%c [ ", (char) (65 + i));
            for (Integer disk : pillar) {
                System.out.print(disk + " ");
            }
            System.out.println("]");
        }
    }
}
