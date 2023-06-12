
class Ass11Q7 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findStartingPosition(nums, target);
        result[1] = findEndingPosition(nums, target);
        return result;
    }

    private int findStartingPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int startingPosition = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            if (nums[mid] == target) {
                startingPosition = mid;
            }
        }

        return startingPosition;
    }

    private int findEndingPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int endingPosition = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            if (nums[mid] == target) {
                endingPosition = mid;
            }
        }

        return endingPosition;
    }
}
