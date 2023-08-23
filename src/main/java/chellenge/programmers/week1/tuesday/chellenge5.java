package chellenge.programmers.week1.tuesday;

public class chellenge5 {
	/*
	 * 수열과 구간 쿼리 2
	 * 
	 * 문제 설명
		정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.

		각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.

		각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
		단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.


		제한사항
		1 ≤ arr의 길이 ≤ 1,000
		0 ≤ arr의 원소 ≤ 1,000,000
		1 ≤ queries의 길이 ≤ 1,000
		0 ≤ s ≤ e < arr의 길이
		0 ≤ k ≤ 1,000,000
	 *
	 */
	public static void main(String[] args) {
		//		입출력 예
		//		arr				queries							result
		//		[0, 1, 2, 4, 3]	[[0, 4, 2],[0, 3, 2],[0, 2, 2]]	[3, 4, -1]
		int [] arr = {0,1,2,4,3};
		int [][]queries ={{0,4,2},{0,3,2},{0,2,2}};

		System.out.println(Solution(arr,queries));

	}

	public static int[]   Solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];
		for(int i =0; i<queries.length; i++) {
			int min=0;
			for(int j=queries[i][0];j<queries[i][1]+1;j++ ) {
				if(arr[j]>queries[i][2]) {
					if(min==0) {
						min=arr[j];
					}
					else if(min>arr[j]) {
						min=arr[j];
					}
					
					
					
				}
			}
			answer[i]=min;
			if(min==0) {
				answer[i]=-1;
			}
			
		}
		return answer;

	}
	//다른사람 풀이
//	class Solution {
//	    public int[] solution(int[] arr, int[][] queries) {
//	        int[] answer = {};
//	        return IntStream.range(0, queries.length)
//	                .map(q -> IntStream.rangeClosed(queries[q][0], queries[q][1])
//	                        .map(i -> arr[i])
//	                        .filter(i -> i > queries[q][2])
//	                        .min().orElse(-1)
//	                ).toArray();
//	    }
//	}
}

