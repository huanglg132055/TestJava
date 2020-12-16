package designPatterns.structuredModel.composite.first;

/**
 * 容器组件
 */
public interface Composite extends Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int index);
}
