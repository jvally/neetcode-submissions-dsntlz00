class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        mem = [amount + 1] * (amount + 1)
        mem[0] = 0

        for amt in range(1, amount + 1):
            for c in coins:
                if amt - c >= 0:
                    mem[amt] = min(mem[amt], 1 + mem[amt - c])#choice to take or dont take

        return mem[amount] if mem[amount] != amount + 1 else -1