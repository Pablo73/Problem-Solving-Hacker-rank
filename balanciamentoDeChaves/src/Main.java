import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    IsBalanced balanced = new IsBalanced();

   List<String> Test = new ArrayList<>();

    Test.add("[()][{}()][](){}([{}(())([[{}]])][])[]([][])(){}{{}{[](){}}}()[]({})[{}{{}([{}][])}]");
    Test.add("[()][{}[{}[{}]]][]{}[]{}[]{{}({}(){({{}{}[([[]][[]])()]})({}{{}})})}");
    Test.add("(])[{{{][)[)])(]){(}))[{(})][[{)(}){[(]})[[{}(])}({)(}[[()}{}}]{}{}}()}{({}](]{{[}}(([{]");
    Test.add("){[]()})}}]{}[}}})}{]{](]](()][{))])(}]}))(}[}{{)}{[[}[]");
    Test.add("}(]}){");
    Test.add("((]()(]([({]}({[)){}}[}({[{])(]{()[]}}{)}}]]{({)[}{(");
    Test.add("{}{({{}})}[][{{}}]{}{}(){{}[]}{}([[][{}]]())");
    Test.add("(){}[()[][]]{}(())()[[([])][()]{}{}(({}[]()))()[()[{()}]][]]");
    Test.add("()([]({}[]){}){}{()}[]{}[]()(()([[]]()))()()()[]()(){{}}()({[{}][]}[[{{}({({({})})})}]])");
    Test.add("[]([{][][)(])}()([}[}(})}])}))]](}{}})[]({{}}))[])(}}[[{]{}]()[(][])}({]{}[[))[[}[}{(]})()){{(]]){][");
    Test.add("{()({}[[{}]]()(){[{{}{[[{}]{}((({[]}{}()[])))]((()()))}(()[[[]]])((()[[](({([])()}))[]]))}]})}");
    Test.add("()(){{}}[()()]{}{}");
    Test.add("{}()([[]])({}){({[][[][[()]]{{}[[]()]}]})}[](())((())[{{}}])");
    Test.add("{}(((){}){[]{{()()}}()})[]{{()}{(){()(){}}}}{()}({()(()({}{}()((()((([])){[][{()}{}]})))))})");
    Test.add("][[{)())))}[)}}}}[{){}()]([][]){{{{{[)}]]{([{)()][({}[){]({{");
    Test.add("{{}(");
    Test.add("{[{((({}{({({()})()})[]({()[[][][]]}){}}))){}}]}{}{({((){{}[][]{}[][]{}}[{}])(())}[][])}");
    Test.add("()[[][()[]][]()](([[[(){()[[]](([]))}]]]))");
    Test.add("()[]({}{})(()){{{}}()()}({[]()}())[](){}(({()}[{}[{({{}}){({}){({})((({()})))}}}]]))");
    Test.add("}[{){({}({)})]([}{[}}{[(([])[(}){[]])([]]}(]]]]{][");
    Test.add("[{]{[{(){[}{}(([(]}])(){[[}(]){(})))}}{{)}}{}][({(}))]}({)");
    Test.add(")})[(]{][[())]{[]{{}}[)[)}[]){}](}({](}}}[}{({()]]");
    Test.add("[[[({[]}({[][[[[][[{(()[][])}()[][]][]{}]]]]}))][(()){}]]]()[{}([]{}){}{{}}]");
    Test.add("({[]({[]})}())[][{}[{{(({{{([{}])}}}))}}]]");
    Test.add("([((()))()])[][][]{}()(([]))[]()[]((){}[]){}(){{}[]}[[{[]}]]");
    Test.add("[[(((({}{[]{}()}){}{{}}){({[]{[{}]{(){}(((){()}))}()}}[[]]()()[()])[[{}{}]()]}))]]{}[]{}({({{}})})");
    Test.add("(]{()}((");
    Test.add("[][(())[({{{()[]}}{[[][[][[[]{{{[()]{{{{}{[]}[][]}}}}}}]]]]}})]]");
    Test.add("}[})})}[)]{}{)");
    Test.add("({(}{})))}(}[)[}{)}}[)[{][{(}{{}]({}{[(})[{[({{[}{(]]})}");
    Test.add("]}})[]))]{][])[}(])]({[]}[]([)");
    Test.add("[{{}{[{{[}[[}([]");
    Test.add("[([]){}][({})({[(([])[][])][[{}{([{{}{(()){{{({}{{}}())}}[]}}()[()[{{{([](()){[[[]]]})}}}]]}])}]]})]");
    Test.add("]{}{(}))}](})[{]]()(]([}]([}][}{]{[])}{{{]([][()){{})[{({{{[}{}](]}}");
    Test.add("{[{}}){(}[][)(}[}][)({[[{]}[(()[}}){}{)([)]}(()))]{)(}}}][");
    Test.add("(]{}{(}}}[)[");
    Test.add("[]{}{[[]]}([{}]{}[]){{(())}}");
    Test.add("[)([{(][(){)[)}{)]]}}([((][[}}(]{}]]}]][(({{{))[[){}{]][))[]{]][)[{{}{()]){)])))){{{[(]}[}}{}]");
    Test.add("{({(){[[[][]{}[[([]{})]{}]][[]()()]]}})}[{}{{}}]");
    Test.add(")}][(})){))[{}[}");
    Test.add("{[]{({]}[}}[{([([)([){{}{(}}[]}}[[{[}[[()(])[}[]");
    Test.add("()()()[]");
    Test.add("((){}])][]][}{]{)]]}][{]}[)(])[}[({(");
    Test.add(")[((])(]]]]((]){{{{())]}]}(}{([}(({}]])[[{){[}]{{}})[){(");
    Test.add("}][[{[((}{[]){}}[[[)({[)}]]}(]]{[)[]}{}(){}}][{()]))})]][(((}}");
    Test.add("([]){}{{}{}}()([([{}{[[]()([(([]()))()[[]]])]}])])");
    Test.add("[()[[]{{[]}()([])}[]][][]][]()[]{}{}[][]{}{}[()(){}]");
    Test.add("{[{){]({(((({](]{([])([{{([])[}(){(]](]{[{[]}}())[){})}))[{})))[");
    Test.add("{}[()[]][]{}{}[[{{[[({})]()[[()]]]}}]]");
    Test.add("{[{}[][]]}[((()))][]({})[]{}{()}");
    Test.add("(){[{({})}]}");
    Test.add("([]])][{)]({)[]))}]())[}]))][}{(}}})){]}]{[)}(][})[[");
    Test.add("((({{}(([{}(())]))[()]{[[[]()]]}})))");
    Test.add("}()))}(}]]{{})}][{](]][{]{[[]]]}]]}([)({([))[[(]}])}[}(([{)[)]]([[](]}]}{]{{})[]){]}{])(");
    Test.add("{}{}{}{[[()]][]}");
    Test.add(")]}]({{})[[[{]{{{}}][))]{{");
    Test.add("))){({}])}])}}]{)()(}(]}([");
    Test.add("([[]][])[[]()][]()(([[]]{[()[]{[][{}]}[()]]{}{[]}}{{}()}(()[([][]{})[[{}][]]{}[]])))");
    Test.add("(]{[({}[){)))}]{[{}][({[({[]))}[}]}{()(([]{]()}})}[]{[)](((]]])([]}}]){)(([]]}[[}[");
    Test.add("([[]])({}(([(){{}[{}]}]){[{}]}))[][{}{}](){}");
    Test.add("[][][][][][([])][]{({()}[[()()]{([(){[]{}}{(())}{[](){}()({}())}[({}[[]()])][]])}])}");
    Test.add("}[{{(}})}}(((())()({]{([]((][(({)[({[]]}[])}]{][{{}]{)][}(])}}}))}}}");
    Test.add("[]({})()[]{}{}[]({}{})[]{([])()[()][{()({})[{}{[[()]{}[]][]}(({{[]{()()()}{}[]()}[]}){{}{}})]}]}");
    Test.add("{{(([{)]{}({][{](){({([[[][)}[)})(");
    Test.add("[{}]{[()({[{}]})]}");
    Test.add("[[{}]]");
    Test.add("]{{({[{]}[[)]]}{}))}{){({]]}{]([)({{[]){)]{}){){}()})(]]{{])(])[]}][[()()}");
    Test.add("{[([}[[{{(]]][}()())]{){(){)]]){})}]{][][(}[]())[}[)})})[][{[)[})()][]))}[[}");
    Test.add("]()])}[}}}{]]{)[}(}]]])])}{(}{([{]({)]}])(})[{}[)]])]}[]{{)){}{()}]}((}}{({])[}])[]}");
    Test.add("(]}[{}{{][}))){{{([)([[])([]{[");
    Test.add("{(()[]){}}(){[]}({{}(()())})([]){}{}(())()[()]{}()");
    Test.add("{{}[{}[{}[]]]}{}({{[]}})[[(){}][]]{}(([]{[][]()()}{{{()()}{[]}({}[]{()})}{()}[[]][()]}))");
    Test.add("{[][]}[{}[](){}]{{}{[][{}]}}");
    Test.add("()(){}(){((){}[])([[]]())}");
    Test.add("{}[[{[((}[(}[[]{{]([(}]][[");
    Test.add("{}[([{[{{}()}]{}}([[{}[]]({}{{()}[][][]})])])]");
    Test.add("{[](}([)(])[]]})()]){[({]}{{{)({}(][{{[}}(]{");
    Test.add("[][]{{}[](())}{}({[()]}())[][[][({}([{}]))]]");
    Test.add("((()))[]{[(()({[()({[]}{})]}))]}{[]}{{({}{})[{}{}]{()([()])[{()}()[[]{}()]{}{}[]()]}[[]{[]}([])]}}");


    for(String t : Test) {
       System.out.println(balanced.isBalanced(t));
    }
   


  }


}