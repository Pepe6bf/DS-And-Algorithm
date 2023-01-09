package algorithm.recursive.hanoi.hanoi_simulation;

public class Game {
    public static void main(String[] args) {
        HanoiSimulation hanoiSimulation = new HanoiSimulation();
//        hanoiSimulation.simulation(3, 'A', 'C', 'B');
        /**
         * count : 원반 개수
         * startPillar : 시작 기둥 위치
         * endPillar : 끝 기둥 위치
         * tempPillar : 중간 기둥 위치
         */
        hanoiSimulation.simulation(5, 'A', 'C', 'B');
    }
}
