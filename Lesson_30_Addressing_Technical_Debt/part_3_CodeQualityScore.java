public class CodeQualityScore {
    private int complexity;
    private int linesOfCode;
    private int bugCount;

    public CodeQualityScore(int complexity, int linesOfCode, int bugCount) {
        this.complexity = complexity;
        this.linesOfCode = linesOfCode;
        this.bugCount = bugCount;
    }

    public int calculateScore() {
        return complexity + (linesOfCode / 10) + (bugCount * 2);
    }
}
