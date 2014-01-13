package ro.redeul.google.go.lang.psi.impl.expressions.binary;

import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import ro.redeul.google.go.lang.lexer.GoTokenTypes;
import ro.redeul.google.go.lang.parser.GoElementTypes;
import ro.redeul.google.go.lang.psi.expressions.binary.GoLogicalOrExpression;
import ro.redeul.google.go.lang.psi.typing.GoType;
import ro.redeul.google.go.lang.psi.typing.GoTypes;
import ro.redeul.google.go.lang.psi.utils.GoTokenSets;
import ro.redeul.google.go.lang.stubs.GoNamesCache;

public class GoLogicalOrExpressionImpl extends GoBinaryExpressionImpl<GoLogicalOrExpression.Op> implements GoLogicalOrExpression
{
    public GoLogicalOrExpressionImpl(@NotNull ASTNode node) {
        super(node, Op.values(), GoElementTypes.OPS_LOG_OR);
    }

    @Override
    protected GoType[] resolveTypes() {
        return new GoType[]{
                GoTypes.getBuiltin(
                        GoTypes.Builtin.Bool,
                        GoNamesCache.getInstance(getProject()))
        };
    }
}
