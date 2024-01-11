//not correct
public class fp5{
	public static int[] sorted(int[] nums){
		int result[] = new int[nums.length];
		int j =-1,high = nums.length-1;
		for(int i =0;i<nums.length;i++){
			if(Math.abs(nums[i])<Math.abs(nums[high])){
				j++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
			else{
				j++;
				int temp1 = nums[i];
				nums[i] = nums[high];
				nums[high] = temp1;
			}
			result[j] = nums[i]*nums[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int nums[] = {-4,-1,0,3,10};
		int[] nums1 = sorted(nums);
		for(int el:nums1){
			System.out.print(el+"  ");
		}
		System.out.println();
		for(int el:nums){
			System.out.print(el+"  ");
		}
	}
}
